package ch18.ex01.local;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by V1 on 04-Apr-17.
 */
public class DirList3 {
    public static void getDir(String[] args) {
        File path = new File("."); // путь до каталога
        String[] list; // массив для хранения

        if (args.length == 0) {
            list = path.list(); // получить список каталогов
        } else {
            list = path.list(new FilenameFilter() {
                                 private Pattern pattern = Pattern.compile(args[0]);   // работает только с final arg

                                 @Override
                                 public boolean accept(File dir, String name) {
                                     return pattern.matcher(name).matches();
                                 }// искать каталоги по pattern
                             }
            );
        }//if_else
            Arrays.sort(list, String.CASE_INSENSITIVE_ORDER); // сортировать каталог
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
