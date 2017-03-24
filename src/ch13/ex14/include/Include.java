package ch13.ex14.include;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nSplit  Check\n");
        String s = "This!!unusual use!!of exclamation!!points";
        String[] a1 = Pattern.compile("!!").split(s);     // простое разбиение
        String[] a2 = Pattern.compile("!!").split(s,3); // ограничение длины
        System.out.println(Arrays.toString(a1)+" "+a1.length);
        System.out.println(Arrays.toString(a2)+" "+a2.length);


    }
}
