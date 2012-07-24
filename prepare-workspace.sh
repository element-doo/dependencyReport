#!/bin/bash

echo Performing dependency update for all projects ...
`dirname $0`/sbt.sh --no-jrebel "$@" update
