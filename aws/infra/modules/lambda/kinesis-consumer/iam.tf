resource "aws_iam_role" "consumer_role" {
  name = "${var.environment}-${var.name}-role"

  assume_role_policy = <<EOF
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Action": "sts:AssumeRole",
      "Principal": {
        "Service": "lambda.amazonaws.com"
      },
      "Effect": "Allow",
      "Sid": ""
    }
  ]
}
EOF
}

resource "aws_iam_policy" "kms_policy" {
  name = "${var.environment}-${var.name}-role-kms-policy"
  description = "KMS policy"
  policy = <<EOF
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Action": [
                "kms:Decrypt"
            ],
            "Resource": "${data.aws_kms_alias.default.target_key_arn}"
        }
    ]
}
EOF
}

resource "aws_iam_role_policy_attachment" "kms_policy_attachment" {
  role = "${aws_iam_role.consumer_role.name}"
  policy_arn = "${aws_iam_policy.kms_policy.arn}"
}


resource "aws_iam_policy" "consumer_process_invoke_policy" {
  name = "${var.environment}-${var.name}-role-consumer-process-invoke-policy"
  description = "Consumer process invoke policy"
  policy = <<EOF
{
    "Version": "2012-10-17",
    "Statement": [
        {
         "Effect":"Allow",
         "Action":"lambda:InvokeFunction",
         "Resource":"${var.consumer_process_lambda_function_arn}"
      }
    ]
}
EOF
}

resource "aws_iam_role_policy_attachment" "consumer_process_invoke_policy_attachment" {
  role = "${aws_iam_role.consumer_role.name}"
  policy_arn = "${aws_iam_policy.consumer_process_invoke_policy.arn}"
}


resource "aws_iam_policy" "log_policy" {
  name = "${var.environment}-${var.name}-role-log-policy"
  description = "Log policy"
  policy = <<EOF
{
   "Version":"2012-10-17",
   "Statement":[
      {
         "Effect":"Allow",
         "Action":[
            "logs:CreateLogStream",
            "logs:CreateLogGroup",
            "logs:PutLogEvents"
         ],
         "Resource":[
            "arn:aws:logs:*"
         ]
      }
   ]
}
EOF
}

resource "aws_iam_role_policy_attachment" "log_policy_attachment" {
  role = "${aws_iam_role.consumer_role.name}"
  policy_arn = "${aws_iam_policy.log_policy.arn}"
}

resource "aws_iam_policy" "kinesis_stream_policy" {
  name = "${var.environment}-${var.name}-role-kinesis-stream-policy"
  description = "Kinesis stream policy"
  policy = <<EOF
{
   "Version":"2012-10-17",
   "Statement":[
      {
         "Effect":"Allow",
         "Action":"lambda:InvokeFunction",
         "Resource":"${aws_lambda_function.consumer.arn}"
      },
      {
         "Effect":"Allow",
         "Action":"kinesis:ListStreams",
         "Resource":"arn:aws:kinesis:*"
      },
      {
         "Effect":"Allow",
         "Action":[
            "kinesis:DescribeStream",
            "kinesis:GetRecords",
            "kinesis:GetShardIterator"
         ],
         "Resource":"${var.kinesis_stream_arn}"
      }
   ]
}
EOF
}

resource "aws_iam_role_policy_attachment" "kinesis_stream_policy_attachment" {
  role = "${aws_iam_role.consumer_role.name}"
  policy_arn = "${aws_iam_policy.kinesis_stream_policy.arn}"
}