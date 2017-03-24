package ch13.ex10.access;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 10 Pattern Matcher Check\n");
        String s = "Java now has regular expressions";
        String[] regex = new String[]{"^Java","\\Breg.*","\\breg.*",
                                      "n.w\\s+h(a|i)s","s?","s*","s+","s{4}","s{1}","s{2}","s{0,3}"};
        System.out.println("String:"+s);
        // ^Java                 в начале строки Java                                       ok
        // \\Breq.*              в середине слова reg и далее любые символы                 нет
        // \\breq.*              в начале слова reg и далее любые символы                   ok
        // n.w\\s+h(a|i)s        n.w любой символ  \\s любой пробел  h(a|i)s  has | his     ok
        // s?                    s или нет один раз                                         ok
        // s*                    s или нет много раз                                        ok
        // s{4}                  s ровно 4 раза                                             нет
        // s{1}                  s ровно 1 раз                                              ok
        // s{2}                  s ровно 2 раза                                             ok
        // s{0,3}                s от 0 до 3 раз                                            ok

        for (String r : regex) {
            System.out.println("Regex:"+r);
            Pattern p = Pattern.compile(r);
            Matcher m = p.matcher(s);
             while (m.find()) {
                System.out.println("Match reg:"+r+" \""+m.group()+"\" at "+m.start()+" "+m.end());
            }
        }

    }
}
