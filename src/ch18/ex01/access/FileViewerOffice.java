package ch18.ex01.access;

import lib.utils.TextFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Created by V1 on 04-Apr-17.
 */
public class FileViewerOffice {
    private static int level = 0;
    private static int count = 0;

    public static void readPath(File path, String args[]) {  // каталоги не пускать иначе выдают Exception
        level++;
        if (level > 8 || args.length < 3) {
            level--;
            return;
        }
        String[] strings;
        if (args == null || args[1] == "") {
            strings = path.list(); // получить список каталогов
        } else {
            strings = path.list(new FilenameFilter() {
                                    private Pattern pattern = Pattern.compile(args[1]);   // работает только с final arg

                                    @Override
                                    public boolean accept(File dir, String name) {
                                        return pattern.matcher(name).matches();
                                    }// искать каталоги по pattern
                                }
            );
        }//if_else
        if (strings == null || strings.length == 0) {
            System.out.println("File not found or dir empty :" + path);
            level--;
            return;
        }
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER); // сортировать каталог
        // чтение подкаталогов
        for (String s : strings) {
            File path2 = new File(path.getPath() + "/" + s);
            if (path2.isDirectory()) {
                readPath(path2, args); // рекурсивный вызов
            } else {
                Set<String> setString = new HashSet<>(new TextFile(path2.toString(), "\\W+")); // набор слов
                if (setString.contains(args[2])) {
                    System.out.printf("%-20s\n", path2.getPath()); // просто вывести имя если есть слово
                    count++;
                }
            }
        }
        level--; // выходим когда отработали все
    }


    public static void getDir(String[] args) {
        if (args == null || args.length < 3) {
            System.out.println("Input parameters: args[] = <path>, <regex>, <search string>");
            return;
        }

        File path = new File(args[0]); // путь до каталога
        readPath(path, args); // repack args
        System.out.println("files:" + count);
    }


}
