package ch13.ex16.access;

import lib.utils.TextFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 07-Mar-17.
 */
public class JGrep {
    private String fName;
    private String regex;
    private int rMode;
    private final String[] RT = {"CANEQ","NOCASE","COMMENT","DOTALL","MULTI","UNICASE","UNIXLINE"};
    private final int[] PT = {  Pattern.CANON_EQ,Pattern.CASE_INSENSITIVE,Pattern.COMMENTS,
                                Pattern.DOTALL,Pattern.MULTILINE,Pattern.UNICODE_CASE,Pattern.UNIX_LINES};

    private File[] files;

    public JGrep(String fName, String regex) {
        this.fName = fName;
        this.regex = regex;

    }

    public JGrep(String fName, String regex, String sMode) {
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

    public void find() {
        ArrayList<String> alist;
        if (fName.length() == 0 || regex.length() == 0 || rMode == 0) {
            System.out.println("Usage:  fileName, regex, rMode");
            System.out.println(Arrays.toString(RT));
            return;
        }
        try {
            alist = new TextFile(fName);
        } catch (Exception e) {
            System.out.println("File Not Found: "+fName);
            return;
        }

        Pattern p = Pattern.compile(regex,rMode);


        Matcher m = p.matcher("");      // подготовили объект для работы со строками
        int index = 1; // перебор строк


        for (String s : alist) {
//            System.out.println(s);
            m.reset(s); // подключили строку
            while (m.find()) {
                System.out.printf("%2d: %-10s %2d\n",index++,m.group(),m.start());  // показывает позицию в строке
            }
        }


    }

// static methods
    private static final int L_MAX = 2;
    private static int level = 0;
    private static void fp(File file,String regex) {
        System.out.println(file.getPath());
        JGrep jp = new JGrep(file.getPath(), regex, "NOCA");
        jp.find();
    }

    public static void fd(File file, String regex) {
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
                    fd(f, regex);  // рекурсивный
                } else {
                    System.out.printf("EXIT LOOP: %s\n", f.getParent());
                }
            } else {
                fp(f, regex);
            }

        }
        level--; // вышли
    }

    public static  void showDemo() {
        // работа с группой файлов
        String regex = "\\b[Ssct]\\w+";                  // вывести все слова с букв S* s* c* t*
        String fName = "src/ch/";
        File f = new File(fName);

        JGrep.fd(f,regex); // рекурсивный вызов заходим с уровнем 0

    }


}
