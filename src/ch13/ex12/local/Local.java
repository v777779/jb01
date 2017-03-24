package ch13.ex12.local;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nFind() Check\n");
        Pattern p = Pattern.compile("\\w+"); // любые символы слов один и более
        Matcher m = p.matcher("Evening is full of the linnet's wings");

        while (m.find()) {                  // работает как итератор разбивет на слова
            System.out.print(m.group()+" . ");
        }
        System.out.println();
        int i = 0;
        while (m.find(i)) {                 // тоже самое, но поиск с заданной позиции
            System.out.print(m.group()+" . ");
            i++;
        }
    }
}
