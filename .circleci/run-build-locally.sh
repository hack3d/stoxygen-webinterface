#!/usr/bin/env bash

curl --user ${CIRCLE_TOKEN}: \
    --request POST \
    --form revision=$(git rev-parse --short HEAD)\
    --form config=@config.yml \
    --form notify=false \
    https://circleci.com/api/v1.1/project/github/hack3d/stoxygen-webinterface/tree/master