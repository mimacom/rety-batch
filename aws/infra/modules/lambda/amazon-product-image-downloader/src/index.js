'use strict'

const AWS = require('aws-sdk');
const Fs = require('fs');
const Path = require('path');
const Axios = require('axios');

console.log('Loading function');

exports.handler = function (event, context, callback) {

    console.log(JSON.stringify(event, null, 2));

    callback(null, "OK");
};

async function downloadImage(url) {
    const path = Path.resolve(__dirname, 'code.jpg');

    // axios image download with response type "stream"
    const response = await Axios({
        method: 'GET',
        url: url,
        responseType: 'stream'
    });

    // pipe the result stream into a file on disc
    response.data.pipe(Fs.createWriteStream(path));

    // return a promise and resolve when download finishes
    return new Promise((resolve, reject) => {
        response.data.on('end', () => {
            resolve()
        });

        response.data.on('error', () => {
            reject()
        });
    });
}
