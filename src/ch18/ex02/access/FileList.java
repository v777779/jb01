package ch18.ex02.access;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Created by V1 on 04-Apr-17.
 */
public class FileList {
    private static int level = 0;
    private static int count = 0;

    public static void getFile(File file, String regex) {
        String[] strings;
        if (regex == "") {
            strings = file.list(); // получить список каталогов
        } else {
            strings = file.list(new FilenameFilter() {
                                    private Pattern pattern = Pattern.compile(regex);   // работает только с final arg
                                    @Override
                                    public boolean accept(File dir, String name) {
                                        return pattern.matcher(name).matches();
                                    }// искать каталоги по pattern
                                }
            );
        }//if_else
        if (strings == null || strings.length == 0) {
            return;
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void readPath(File path, String regex) {  // каталоги не пускать иначе выдают Exception
        level++;
        if (level > 8) {
            level--;
            return;
        }
        if (!path.isDirectory()) {
            getFile(path,regex);
            level--;
            return;
        }
        File[] fList = path.listFiles();
        if (fList == null || fList.length == 0) {
            level--;
            return;
        }
        for (File file : fList) {
            if (file.isDirectory()) {
                readPath(file,regex);
            } else {
                getFile(file,regex);
            }
        }
        level--; // выходим когда отработали все
    }


    public static void getDir(String[] args) {
        readPath(new File(args[0]),".+");
        System.out.println("files:" + count);
    }


}
