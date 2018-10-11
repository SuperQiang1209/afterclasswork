@echo off
title %cd%
echo.
echo [信息] 生成Mybatis代码。
echo.

cd %~dp0
cd..
set MAVEN_OPTS=%MAVEN_OPTS% -Xms256m -Xmx512m -XX:PermSize=128m -XX:MaxPermSize=256m
call mvn mybatis-generator:generate

pause