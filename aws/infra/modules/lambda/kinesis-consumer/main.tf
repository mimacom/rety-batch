resource "aws_lambda_function" "consumer" {
  filename = "${path.module}/src/consumer.zip"
  function_name = "${var.environment}-${var.name}"
  role = "${aws_iam_role.consumer_role.arn}"
  handler = "index.handler"
  source_code_hash = "${base64sha256(file("${path.module}/src/consumer.zip"))}"
  runtime = "nodejs8.10"
  memory_size = "512"
  timeout = "30"

  kms_key_arn = "${data.aws_kms_alias.default.target_key_arn}"

  environment {
    variables = {
      CONSUMER_PROCESS_LAMBDA_NAME = "${var.consumer_process_lambda_function_name}"
    }
  }

  tags {
    Name = "${var.environment}-bulktrade-v1-sms-consumer"
    Environment = "${var.environment}"
  }

  lifecycle {
    create_before_destroy = true
  }
}

resource "aws_lambda_event_source_mapping" "consumer_event_source_mapping" {
  batch_size = 100
  event_source_arn = "${var.kinesis_stream_arn}"
  enabled = true
  function_name = "${aws_lambda_function.consumer.arn}"
  starting_position = "TRIM_HORIZON"
}