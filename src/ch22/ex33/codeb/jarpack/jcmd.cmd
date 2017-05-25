echo off
rem run from jb01
rem D:\_lessons\java\[]_sandbox\jb01> .\src\ch22\ex33\codeb\jarpack\jcmd.cmd
rem copy out\production\jb01\ch22\ex33\codeb\*.class src\ch22\ex33\codeb\jarpack\*
rem del out\production\jb01\ch22\ex33\codeb\*.class
rem del src\ch22\ex33\codeb\jarpack\*.class
echo on
del /q .\src\ch22\ex33\codeb\jarpack\*.jar
javac -cp "C:\Program Files\Java\jdk1.8.0_112\jre\lib\javaws.jar;.\src"  -d .\src\ch22\ex33\codeb\jarpack  .\src\ch22\ex33\codeb\CodeB.java
cd src\ch22\ex33\codeb\jarpack
jar cvf jnlpfilechooser.jar ch22\ex33\codeb/*.class

cd ..\..\..\..\..\
rmdir /q /s .\src\ch22\ex33\codeb\jarpack\ch22
rmdir /q /s  D:\temp2\_jarpack
mkdir D:\temp2\_jarpack
copy src\ch22\ex33\codeb\jarpack\* D:\temp2\_jarpack
