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
public class FileViewerList {
    private static int level = 0;
    private static int count = 0;

    public static void readLocal(File path, String regex, String search) {  // каталоги не пускать иначе выдают Exception
        File[] files;
        if (regex == "") {
            files = path.listFiles(); // получить список каталогов
        } else {
            files = path.listFiles(new FilenameFilter() {  // все тоже самое но список файлов
                                    private Pattern pattern = Pattern.compile(regex);   // работает только с final arg

                                    @Override
                                    public boolean accept(File dir, String name) {
//                                        return pattern.matcher(new File(name).getName()).matches();
                                        return pattern.matcher(name).matches(); // что имена файлов,
                                    }// искать каталоги по pattern
                                }
            );
         }//if_else
        if (files == null || files.length == 0) {
            System.out.println("Path not found or dir empty :"+path);
            level--;
            return;
        }

        // чтение подкаталогов
        for (File file : files) {
            if (!file.isDirectory()) {
                Set<String> set = new HashSet<>(Arrays.asList(TextFile.read(file.toString()).split("\\W+")));
                if (set.contains(search)) {
                    System.out.printf("%-20s\n", file.getPath()); // просто пока вывести имя
                    count++;
                }
            }

        }
    }


    public static void getDir(String[] args) {
        if (args == null || args.length < 2) {
            System.out.println("No parameters: args[] <path>,<regex>");
        }
        File path = new File(args[0]); // путь до каталога
        readLocal(path, args[1],args[2]);
        System.out.println("files:" + count);
    }


}
