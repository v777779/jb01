package ch13.ex11.access;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 11 Regex Check\n");
        String s = "Arline ate eight apples and one orange while Anita hadn’t any";
        String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        //                        ^гласная + (1+)любой  [гласная] на конце слова
        //                пробел + гласная + (1+)любой  [гласная] на конце слова
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while (m.find()) {
            System.out.println(m.group()+" "+m.start()+" "+m.end());
        }
    }
}
