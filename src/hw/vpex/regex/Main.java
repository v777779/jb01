package hw.vpex.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Vadim Voronov
 * Created: 14-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Main {
    public static void main(String args[]) {
        Pattern patt = Pattern.compile("(?<=[\\?|\\&])[a-zA-Z0-9]+(?=\\=)");
        Matcher match = patt.matcher("https://www.google.ru/search?q=lalal&oq=pppr&ie=UTF");


        int i = 1;
        int j = 0;
        while (match.find()) {
            if (j++ == i) {
                System.out.println(match.group());
            }
        }

        patt = Pattern.compile("(?<=[?|&])(\\w+)(?=\\=)");
        match = patt.matcher("https://www.google.ru/search?q=lalal&oq=pppr&ie=UTF");
        while (match.find()) {
//                System.out.println(match.group().replaceAll("\\W+",""));
            System.out.println(match.group());
        }

    }
}
