Последовательность создания файла jar

1. Make *.class  Скомпилировать классы, желательно вручную.

При компиляции УКАЗАТЬ путь до файла  javaws.jar библиотеки JNLP
ВНИМАНИЕ. Компилировать строго по одному jar файлу иначе не берет
Компиляция с прямым указанием библиотеки
javac -classpath "C:\Program Files\Java\jdk1.8.0_112\jre\lib\javaws.jar;./" JMain.java

2. Make *.jar Создание файла jar
jar cvf jnlpfilechooser.jar *.class


3. Edit xml  редактирование файла 
ВНИМАНИЕ. Все файлы лежат в одной папке  <codebase>
codebase="file:///D:/temp2/_jarpack"       			это папка назначения где все файлы  html, jnlp, jar
href="filechooser.jnlp">							имя файла или полный путь до файла jnlp
<jar href="jnlpfilechooser.jar" download="eager"/>	имя файла или полный путь до файла jar 
main-class="ch22.ex33.codeb.CodeB"/>				имя класса с методом main()  если нет пути то просто JMain


4. Edit html редактирование файла
<a href="filechooser.jnlp">click here</a>			имя файла jnlp