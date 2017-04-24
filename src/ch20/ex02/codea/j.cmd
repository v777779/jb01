echo off
set PATH=C:\Program Files\Java\jdk1.7.0_80\bin;%PATH%
rem echo %path%
apt -factory ch20.ex02.codea.InterfaceExtractorProcessorFactory Multiplier.java -s ./ -d ../../../../out/production/jb01 -cp ../../../../out/production/jb01
