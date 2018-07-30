resource "aws_iam_role" "processor_role" {
  name = "${var.environment}-amazon-product-image-downloader-role"

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
  name = "${aws_iam_role.processor_role.name}-kms-policy"
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
  role = "${aws_iam_role.processor_role.name}"
  policy_arn = "${aws_iam_policy.kms_policy.arn}"
}

resource "aws_iam_policy" "s3_policy" {
  name = "${aws_iam_role.processor_role.name}-s3-policy"
  description = "KMS policy"
  policy = <<EOF
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Action": [
                "s3:List*",
                "s3:PutObject",
                "s3:DeleteObject",
                "s3:GetObject"
            ],
            "Effect": "Allow",
            "Resource": "arn:aws:s3:::${var.bucket_name}/*"
        },
        {
            "Action": [
                "s3:List*"
            ],
            "Effect": "Allow",
            "Resource": "arn:aws:s3:::${var.bucket_name}"
        }
    ]
}
EOF
}

resource "aws_iam_role_policy_attachment" "s3_policy_attachment" {
  role = "${aws_iam_role.processor_role.name}"
  policy_arn = "${aws_iam_policy.s3_policy.arn}"
}