echo off
set PATH=C:\Program Files\Java\jdk1.7.0_80\bin;%PATH%
rem echo %path%
apt -factory ch20.ex02.exercise.annotate.InterfaceExtractorProcessorFactory annotate/Multiplier.java -s ./annotate -d ../../../../out/production/jb01 -cp ../../../../out/production/jb01
apt -factory ch20.ex02.exercise.annotate.InterfaceExtractorProcessorFactory annotate/Divider.java -s ./annotate -d ../../../../out/production/jb01 -cp ../../../../out/production/jb01
apt -factory ch20.ex02.exercise.annotate.InterfaceExtractorProcessorFactory annotate/Math.java -s ./annotate -d ../../../../out/production/jb01 -cp ../../../../out/production/jb01
