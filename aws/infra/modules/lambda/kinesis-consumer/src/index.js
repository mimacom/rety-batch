var AWS = require('aws-sdk');

console.log('Loading function');

const CONSUMER_PROCESS_LAMBDA_NAME = process.env.CONSUMER_PROCESS_LAMBDA_NAME;

const invokeLambda = (lambda, params) => new Promise((resolve, reject) => {
    lambda.invokeAsync(params, (error, data) => {
        if (error) {
            reject(error);
        } else {
            resolve(data);
        }
    });
});

exports.handler = function (event, context, callback) {
    console.log(JSON.stringify(event, null, 2));

    event.Records.forEach(function (record) {
        const payload = new Buffer(record.kinesis.data, 'base64').toString('ascii');
        console.log('Decoded payload:', payload);

        const lambda = new AWS.Lambda();
        const params = {
            FunctionName: CONSUMER_PROCESS_LAMBDA_NAME,
            InvokeArgs: JSON.stringify(payload),
        };

        invokeLambda(lambda, params)
            .then((data) => {
                console.log('Process Lambda invoked with payload: ', payload);
                console.log('Data:', data);
            })
            .catch((e) => {
                callback(new Error(e));
            });
    });
};