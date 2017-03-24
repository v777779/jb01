package ch13.ex18_not_success.access;

import lib.utils.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 18 RegEx Check\n");

        final  String REGEX =  "\"(?:[^\"\\\\\\n\\r]|(?:\\\\(?:[untbrf\\\\'\"]"
                        + "|[0-9A-Fa-f]{4}|[0-7]{1,2}|[0-3][0-7]{2})))*\"";

        String fName = "src/ch13.ex18_not_success/access/Access.java";        // первое условие  чтение в файл
        String t1 = "t1 test string \" test string \"\" class end " + "t2 test streing \" end of t2";
        String s = TextFile.read(fName);

        String regex = REGEX;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }

    }
}
