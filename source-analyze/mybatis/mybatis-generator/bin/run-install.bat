@echo off
title %cd%
echo.
echo [��Ϣ] �����ع����̡�
echo.

cd %~dp0
cd..
set MAVEN_OPTS=%MAVEN_OPTS% -Xms256m -Xmx512m -XX:PermSize=128m -XX:MaxPermSize=256m
::call mvn clean install -e -U
call mvn clean install

pause