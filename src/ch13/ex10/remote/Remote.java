package ch13.ex10.remote;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Remote {
    public static void app() {
        System.out.println("\n====REMOTE===");
        System.out.println("\nPattern и Matcher Check\n");

        String s = "abcabcabcdefabc";
        String[] regexp = new String[] { "(abc+)", "(abc)+","(abc){2,}" }; // {2,} abc минимум 2 раза
        System.out.println("String: "+s);
        for (String r : regexp) {
            Pattern p = Pattern.compile(r); // скомпилировали pattern
            Matcher m = p.matcher(s);       // связать pattern с выражением

            while (m.find()) {
                System.out.println("Match rgx"+r+": \""+m.group()+"\" at pos."+m.start()+"-"+ (m.end()-1));
            }
        }  // перебрать разные regexp

    }
}
