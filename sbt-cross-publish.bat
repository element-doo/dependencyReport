@echo off
setlocal 

echo Will cross-publish sbt plugin to the maven server
set "CROSS_PUBLISH=^publish"
call "%~dp0sbt.bat" %* "%%CROSS_PUBLISH%%"
