package ch18.ex01.local;

import java.io.File;
import java.util.Arrays;

/**
 * Created by V1 on 04-Apr-17.
 */
public class DirList {

    public static void getDir(String[] args) {
        File path = new File("."); // путь до каталога
        String[] list; // массив для хранения

        if (args.length == 0) {
            list = path.list(); // получить список каталогов
        } else {
            list = path.list(new DirFilter(args[0])); // искать каталоги по pattern
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER); // сортировать каталог
        for (String s : list) {
            System.out.println(s);
        }
    }
}
//    String regex = "(\\w+\\W+)+zip";  // выбранные
//        regex = ".+";  // все файлы
//
//                args = new String[] { regex}; // фильтр по файлам
