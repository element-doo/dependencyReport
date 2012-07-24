@echo off

echo Performing dependency update for all projects ...
call "%~dp0\sbt.bat" --no-jrebel %* update
