# AWS Step Functions Workflow Demo

This is a Java version of [Create a Serverless Workflow](https://aws.amazon.com/getting-started/tutorials/create-a-serverless-workflow-step-functions-lambda/)


## Prerequisites
* [SAM CLI](https://github.com/awslabs/serverless-application-model) installed.
* Java 8 or higher.
* A recent Maven version.

## How to run
First create an S3 bucket with some name. Then edit `package-and-deploy.sh.tmp` and replace <BUCKET_NAME> with that name.
Then rename  `package-and-deploy.sh.tmp` to `package-and-deploy.sh` and run `sh package-and-deploy.sh`

