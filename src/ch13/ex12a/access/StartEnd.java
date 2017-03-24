package ch13.ex12a.access;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 06-Mar-17.
 */
public class StartEnd {
    private String s = "Twas brillig, and the slithy toves\n" +
            "Did gyre and gimble in the wabe.\n" +
            "All mimsy were the borogoves,\n" +
            "And the mome raths outgrabe.\n\n" +
            "Beware the Jabberwock, my son,\n" +
            "The jaws that bite, the claws that catch.\n" +
            "Beware the Jubjub bird, and shun\n" +
            "The frumious Bandersnatch.";

    private String r = "\\w*ere\\w*\n" + "\\w*ever\n"+"[A-Z]?.*\n"+"Never.*?!\n";
    public String[] getInputArray() {
        return s.split("\n");
    }
    public String[] getRegexArray() {
        return r.split("\n");
    }

    private class Display {
        private boolean regexPrint = false;
        private String regex;

        public Display(String regex) {
            this.regex = regex;
        }

        private void display(String s) {
            if (!regexPrint) {
                regexPrint = true;
                System.out.println(regex);
            }
            System.out.println(s);
        }
    }

    public void examine(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s); // получили связку
        while (m.find()) {
            d.display("find():" + m.group() + " start:" + m.start() + " end:" + m.end()); // один раз печатается regex
        }
        if (m.lookingAt()) {  // разовая акция
            d.display("lookingAt() start." + m.start() + " end." + m.end());
        }
        if (m.matches()) {  // разовая акция
            d.display("matches() start." + m.start() + " end." + m.end());
        }
    }


}
