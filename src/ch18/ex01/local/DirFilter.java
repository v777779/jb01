package ch18.ex01.local;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Created by V1 on 04-Apr-17.
 */
public class DirFilter implements FilenameFilter{  // фильтр для имен файлов
private Pattern pattern;
private String regex;

    public DirFilter(String regex) {
        this.regex = regex;
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {  // классически искать файлы по pattern
        return pattern.matcher(name).matches();
    }

}
//       System.out.printf("%-32s regex:%-10s matcher:%b\n", name,regex, pattern.matcher(name).matches());
//        String s = "jdk-8u112-windows-x64-demos.zip";
//        System.out.println(s.replaceAll(regex,"_"));
