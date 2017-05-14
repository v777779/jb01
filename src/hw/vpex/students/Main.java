package hw.vpex.students;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Vadim Voronov
 * Created: 14-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Main {
    public static class MyException extends Exception {
        String name;

        public MyException() {
        }

        public MyException(String name) {
            super(name);
        }
    }

    public static int getWords(String string, char ch) {
        String regexStart = String.format("(\\b[%c]\\w+)", ch); // слова начинаются
        String regexEnd = String.format("(\\b\\w+%c\\W+)|(\\b\\w+%c$)", ch, ch); // слова завершаются

        Matcher m = Pattern.compile(regexStart + "|" + regexEnd).matcher(string);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "Alex Benchmark stop Mind Windows Lucky start Ammo Figsht Flight Light String Booleans";

        System.out.println("Number words started or ended with 'A':" + getWords(string, 'A'));
        System.out.println("Number words started or ended with 's':" + getWords(string, 's'));
        System.out.println("Number words started or ended with 'E':" + getWords(string, 'E'));

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter 1 to issue MyException(0 exit)> ");

            if (in.next().equals("1")) {
                throw new MyException("MyException: pressed '1' ");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }

    }
}
