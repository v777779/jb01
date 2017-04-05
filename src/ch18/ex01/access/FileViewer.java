package ch18.ex01.access;

import lib.utils.TextFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by V1 on 04-Apr-17.
 */
public class FileViewer {
    private static int level = 0;
    private static int count = 0;

    public static void readPath(File path, String regex) {  // каталоги не пускать иначе выдают Exception
        level++;
        if (level > 8) {
            level--;
            return;
        }
        String[] strings;
        if (regex == "") {
            strings = path.list(); // получить список каталогов
        } else {
            strings = path.list(new FilenameFilter() {
                                    private Pattern pattern = Pattern.compile(regex);   // работает только с final arg

                                    @Override
                                    public boolean accept(File dir, String name) {
                                        return pattern.matcher(name).matches();
                                    }// искать каталоги по pattern
                                }
            );
        }//if_else
        if (strings == null || strings.length == 0) {
            System.out.println("Path not found or dir empty :"+path);
            level--;
            return;
        }
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER); // сортировать каталог
        // чтение подкаталогов
        for (String s : strings) {
            File path2 = new File(path.getPath() + "/" + s);
            if (path2.isDirectory()) {
                readPath(path2, regex); // рекурсивный вызов
            } else {
                count++;
                String fileString = TextFile.read(path2.toString());
                if (fileString.contains("args[0]")) {
                    System.out.printf("%-27s : %s\n", s, fileString.substring(0, 75).replaceAll("\n", " ")); // просто пока вывести имя
                }
            }

        }
        level--; // выходим когда отработали все
    }


    public static void getDir(String[] args) {
        File path = new File("./src"); // путь до каталога
        readPath(path, args[0]);
        System.out.println("files:" + count);
    }


}
