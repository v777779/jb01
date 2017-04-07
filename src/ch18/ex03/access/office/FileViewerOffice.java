package ch18.ex03.access.office;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by V1 on 04-Apr-17.
 */
public class FileViewerOffice {
    private static int count = 0;
    private static long total = 0;

    public static void readPath(File path, String args[]) {  // каталоги не пускать иначе выдают Exception
        String[] list;
        if (args == null || args.length == 0) {
            list = path.list(); // получить список каталогов
        } else {
            list = path.list(new FilenameFilter() {
                Pattern pattern = Pattern.compile(args[1]);   // скомпилировали regex

                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
        }//if_else
        if (list == null || list.length == 0) {
            System.out.println("Files not found");
            return;
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);  // сортировать список

        for (String s : list) {
            long fileSize = new File(path.getPath()+"\\"+s).length();
            System.out.println(s + ", " + fileSize+" bytes"); // распечатать найденный файл
            total += fileSize;
            count++;
        }
    }


    public static void getDir(String[] args) {
        if (args == null || args.length < 2) {
            System.out.println("Input parameters: args[0]=path args[1]=<regex>");
            return;
        }
        System.out.println("List of files:");
        System.out.println("==================================");
        File path = new File(args[0]); // путь до каталога
        readPath(path, args);           // repack args
        System.out.println("==================================");
        System.out.println(count+" files, "+ total+" bytes");
        System.out.println("Total size :"+total);
        System.out.println("Total count:"+count);

    }


}
