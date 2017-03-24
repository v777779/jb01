package ch13.ex14.local;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nRegex Flags Check\n");
        String s = "java has regex\nJavahasRegex\n" +
                "JAVA hase pretty good regular expressions\n" +
                "Regular expressions are in Java";
        // "^java слово Java/java только с начала строки
        Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }

    }
}
