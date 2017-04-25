package lib.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 11-Apr-17.
 */
public class RegexCh {
    public static void check() {

        String s = "* Created: 11-Apr-17.";

        String regex = "(\\d*[-.]\\w*[-.]\\d*)";
        Pattern p = Pattern.compile(regex);
        Matcher matcher =  p.matcher(s);
        while (matcher.find()) {
            String s2 = matcher.group();
            System.out.println(s2);
        }
        s = "* Created by V1 26.03.17.";
        matcher = p.matcher(s);
        while (matcher.find()) {
            String s2 = matcher.group();
            System.out.println(s2);
        }

    }
}
