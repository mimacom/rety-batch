#!/bin/bash
set -e

CURRENT_PATH=`dirname $0`

rm -f consumer.zip
pushd ${CURRENT_PATH}/src
    zip -vr ../consumer.zip index.js
popd