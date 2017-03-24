package ch13.ex17.access;

import lib.utils.TextFile;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 07-Mar-17.
 */
public class JGrepFile {
    private String fName;
    private String regex;
    private int rMode;
    private final String[] RT = {"CANEQ","NOCASE","COMMENT","DOTALL","MULTI","UNICASE","UNIXLINE"};
    private final int[] PT = {  Pattern.CANON_EQ,Pattern.CASE_INSENSITIVE,Pattern.COMMENTS,
                                Pattern.DOTALL,Pattern.MULTILINE,Pattern.UNICODE_CASE,Pattern.UNIX_LINES};

    public JGrepFile(String fName, String regex, String sMode) {
        this.fName = fName;
        this.regex = regex;
        this.rMode = getMode(sMode);

    }

    private int getMode(String s) {
        if (s.length() == 0) {
            return 0;
        }
        for (int i = 0; i <RT.length ; i++) {
            String regex = "(?i)"+RT[i].substring(0,4)+".*"; // первые 4 символа
            if (s.matches(regex)) {
                System.out.println("Mode:"+RT[i]);
                return PT[i];
            }
        }
        return 0;
    }

    public void errMessage() {
        System.out.println("Usage   : fileName, regex, rMode");
        System.out.println("fileName: \"src\\ch\\ex15\\\"");
        System.out.println("rmode   : \""+Arrays.toString(RT).replaceAll("[\\[|\\]]","")+"\"");
        System.out.println("regex   : \"\\\\b[Ssct]\\\\w+\"");

    }
    public void find() {
        String sList;
        if (fName.length() == 0 || regex.length() == 0 || rMode == 0) {
            errMessage();
            return;
        }
        try {
            sList = TextFile.read(fName);
        } catch (Exception e) {
            System.out.println("File Not Found: "+fName);
            errMessage();
            return;
        }

        Pattern p = Pattern.compile(regex,rMode);
        Matcher m = p.matcher("");      // подготовили объект для работы со строками
        int index = 1; // перебор строк

        m.reset(sList);
        while (m.find()) {
                System.out.printf(":%s\n",m.group());  // показывает позицию в строке
        }
    }

// static methods
    private static final int L_MAX = 2;
    private static int level = 0;
    private static void fp(File file,String regex, String sMode) {
        System.out.println(file.getPath());
        JGrepFile jp = new JGrepFile(file.getPath(), regex, sMode);
        jp.find();
    }

    public static void fd(File file, String regex, String sMode) {
        File[] files;
        level++; // на следующий уровень
        if (file.isDirectory()) {  // это директорий
            files = file.listFiles();
        } else {
            files = new File[]{file};
        }
        for (File f : files) {
            if (f.isDirectory()) {
                if (level < L_MAX) {
                    fd(f, regex, sMode);  // рекурсивный
                } else {
                    System.out.printf("EXIT LOOP: %s\n", f.getParent());
                }
            } else {
                fp(f, regex,sMode);
            }

        }
        level--; // вышли
    }

    public static  void showDemo() {
// работа с группой файлов
//        String regex = "\\b[Ssct]\\w+";                  // вывести все слова с букв S* s* c* t*
        String regex = "(//(.*))|/\\*((?s).*?)\\*\\/"; // вывести комментарии
        String fName = "src/ch13.ex15/access";
        String sMode = "COMM";
        showDemo(fName,regex,sMode);
    }

    public static  void showDemo(String fName, String regex) {
        String sMode = "COMM";
        showDemo(fName,regex,sMode);
    }

    public static  void showDemo(String fName, String regex, String sMode) {
        File f = new File(fName);
        fd(f,regex,sMode);
    }

}
