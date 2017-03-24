package ch13.ex10.include;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {

    public static void match(String s, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        System.out.println("String:"+s);
        System.out.println("regex :"+regex);
        if (!p.matches(regex,s)) {
            System.out.println("I not found mathes");
            return;
        }

        while (m.find()) {
            System.out.printf("I found the text <%s> starting at %d ending at %d \n",m.group(),m.start(),m.end());
        }
    }

    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nQuantifiers Check\n");
        String s = "xfoooooooooofoo";
        match(s,".*foo");       // greedy
        match(s,".*?foo");      // relactance
        match(s,".*+foo");      //possessive  захватил всю строку по шаблону .* и на foo места не осталось
        match(s,".{2}o*+foo");  //possessive разрешили захватить только <oo..o>


    }
}
