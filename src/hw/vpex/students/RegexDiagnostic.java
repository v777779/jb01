package hw.vpex.students;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Vadim Voronov
 * Created: 14-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class RegexDiagnostic {
    public static class MyException extends Exception {
        String name;
        public MyException() {
        }
        public MyException(String name) {
            super(name);
        }
    }

    public static int getWords(String string, char ch) {
//String regex = "(\\b[A]\\w+)"; // слова на A
//String regex = "(\\b\\w+s\\W+)|(\\b\\w+s$)"; // слова на A
        String regexStart = String.format("(\\b[%c]\\w+)",ch); // слова начинаются
        String regexEnd = String.format("(\\b\\w+%c\\W+)|(\\b\\w+%c$)",ch,ch); // слова завершаются

        Matcher m = Pattern.compile(regexStart+"|"+regexEnd).matcher(string);
        int count = 0;
        while (m.find()) {
            System.out.println(m.group());
            count++;
        }
        return count;
    }

    public static int getWords2(String string, char ch) {
        String regex = "(\\b[" + ch + "][A-Za-z]+)"; // слова начинаются с символа
        return string.split(regex).length - 1;
    }

    public static void main(String[] args) {
        String string = "Alex Benchmark stop Mind Windows Lucky start Ammo Figsht Flight Light String Booleans";
        String regex = "(\\b[Ee][A-Za-z]+)"; // слова на A
        regex = "((\\W+)*[A][A-Za-z]+)(\\W+)"; // слова на A
        regex = "(\\b[A]\\w+)"; // слова на A
        regex = "(\\b\\w+s\\W+)|(\\b\\w+s$)"; // слова на A

        System.out.println(getWords(string,'L'));

//        System.out.println(string.replaceAll(regex,"*"));
//        System.out.println(string.split(regex).length-1);
//        String[] s= string.split(regex);
//
//        Matcher m = Pattern.compile(regex).matcher(string);
//        while (m.find()) {
//            System.out.println(m.group());
//        }

//        System.out.println("Number of words started or ended with 'A':" + getWords(string, 'A'));
//        System.out.println("Number of words started with 's':" + getWords(string, 's'));
//        System.out.println("Number of words started with 'E':" + getWords(string, 'E'));

//        try {
//            Scanner in = new Scanner(System.in);
//            System.out.print("Please enter 1 to issue MyException(0 exit)> ");
//
//            if (in.next().equals("1")) {
//                throw new MyException();
//            }
//        } catch (MyException e) {
//            throw new RuntimeException(e);
//        }

    }
}
