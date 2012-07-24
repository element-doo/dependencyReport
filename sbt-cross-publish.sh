#!/bin/bash

echo Will cross-publish sbt plugin to the maven server
`dirname $0`/sbt.sh --no-jrebel "$@" '^publish'
