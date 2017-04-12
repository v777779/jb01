package lib.files;

import java.io.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 11-Apr-17.
 */
public class BFileParser {
    // call  BFileParcer.check("./src/ch18/ex24/ex24.java,"./src/ch18/ex23")
    private static final String[] HEADER_JAVA = {
            " * Copyright (c) 2017 Vadim Voronov",
            " * email: vaidim.v.voronov@gmail.com",
            " * Created: "
    };
    private static String stringDateEx;

    public static  void check() {
        BFileParser.check("./src/ch18/24/Ex24.java");
    }

    public static void check(String filePath) {
        String fileExName = "";
        if (filePath.endsWith(".java")) {
            fileExName = filePath;
            filePath = new File(filePath).getParent();
            stringDateEx = getDate(getDateString(fileExName));
        }
        String path = new File(filePath).getAbsolutePath().replace("\\.\\", "\\");
        List<File> list = Catalog.walk(path, ".*.java").getListFiles();
        for (File file : list) {
            replaceDate(file.getAbsolutePath());  // скопировать и поменять дату
        }
        System.out.println(path + ": parcer done..");
    }


    private static void replaceDate(String fileExName) {
        String fileWrite = fileExName.replace(".", "_temp_.");
        new File(fileWrite).delete();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileExName));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileWrite));

            String s;
            boolean fMeet = false;
            while ((s = br.readLine()) != null) {
                if (!fMeet && s.contains("* Created:")) {
                    String stringDate = getDate(s); // выташить дату
                    if (isExercise(fileExName) && stringDateEx != null) {
                        stringDate = stringDateEx;
                    }
                    s = (HEADER_JAVA[2]+stringDate+".");
                    fMeet = true;
                }
                if (!fMeet && s.contains("* Created by V1")) {
                    String stringDate = getDate(s); // выташить дату
                    if (isExercise(fileExName) && stringDateEx != null) {
                        stringDate = stringDateEx;
                    }
                    bw.write(HEADER_JAVA[0]+"\r\n");
                    bw.write(HEADER_JAVA[1]+"\r\n");
                    s = (HEADER_JAVA[2]+stringDate+".");
                    fMeet = true;
                }
                s = s + "\r\n";
                bw.write(s);
            }
            br.close();
            bw.close();

            new File(fileExName).delete();
            new File(fileWrite).renameTo(new File(fileExName));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static String getDate(String s) {
        String regex = "(\\d*[-.]\\w*[-.]\\d*)";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(s);
        while (matcher.find()) {
            return matcher.group();
        }
// если не нашли вылетаем
        throw new RuntimeException("Invalid Date Format" + s);
    }

    private static boolean isExercise(String fileExName) {
        String regex = ".*((Code[\\p{Upper}])|(Exercise)).java";

        Pattern p = Pattern.compile(regex);

        return p.matcher(fileExName).matches();
    }


    private static String getDateString(String fileExName) {
        String s;
        try {
            RandomAccessFile fr = new RandomAccessFile(fileExName, "r");
            while ((s = fr.readLine()) != null) {
                if (s.contains("* Created")) {
                    fr.close();
                    break;
                }
            }
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return s;
    }

}
