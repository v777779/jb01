package ch18.ex01.access.office;

import lib.utils.TextFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by V1 on 04-Apr-17.
 */
public class FileViewerOffice {
    private static int count = 0;

    public static void readPath(File path, String args[]) {  // каталоги не пускать иначе выдают Exception
        String[] strings;
        if (args == null || args.length == 0) {
            strings = path.list(); // получить список каталогов
        } else {
            strings = path.list(new FilenameFilter() {
                                    @Override
                                    public boolean accept(File dir, String name) {
                                        // analyze  by ext
                                        if (name.toLowerCase().endsWith(args[0])) {
                                            if (args.length == 1) { // сортировка только по расширению
                                                return true; // файл принят
                                            }
                                            String pathFile = new File(dir, name).getAbsolutePath();
                                            Set<String> hSet = new HashSet<>(new TextFile(pathFile, "\\W+"));
                                            for (int i = 1; i < args.length; i++) {
                                                if (hSet.contains(args[i])) {
                                                    return true; // вернуть если хотя бы одно слово найдено
                                                }
                                            }
                                        }
                                        return false;
                                    } // accept
                                } // class
            );
        }//if_else
        if (strings == null || strings.length == 0) {
            return;
        }
        // чтение найденных файлов
        for (String s : strings) {
                System.out.println(s); // распечатать найденный файл
                    count++;
        }
    }


    public static void getDir(String pathName, String[] args) {
        if (args == null || args.length < 2) {
            System.out.println("Input parameters: args[] = <ext>, <search string>,...");
            return;
        }

        File path = new File(pathName); // путь до каталога
        readPath(path, args);           // repack args
        System.out.println("files:" + count);
    }


}
