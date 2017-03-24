package ch13.ex12.integra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nMatcher Group Check\n");
        String poem = "Twas brillig, and the slithy toves\n" +
                "Did gyre and gimble in the wabe.\n" +
                "All mimsy were the borogoves,\n" +
                "And the mome raths outgrabe.\n\n" +
                "Beware the Jabberwock, my son,\n" +
                "The jaws that bite, the claws that catch.\n" +
                "Beware the Jubjub bird, and shun\n" +
                "The frumious Bandersnatch.";
        String regex = "(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$";
//        String regex = "(?m)(\\S+\\s+\\S+\\s+\\S+)$";
        // (?m)  multiline mode  работает со строками внутри блока
        //\\S+   полезный символ много
        //\\s+   перевод строки много
        // структура строки  (w)" "((w)" "(w))$   три слова до конца строки
        // структура строки  (w)" "((w)" "(w))$   три слова до конца строки
        // распечатка групп  0:  (w1) ((w2) (w3))
        //                   1:  (w1)
        //                   2:  ((w2) (w3))
        //                   3:  (w2)
        //                   4:  (w3)
        // 0.[the slithy toves]1.[the]2.[slithy toves]3.[slithy]4.[toves]
        Matcher m = Pattern.compile(regex).matcher(poem);
        while (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) {  // показывает сколько групп захвачено???
                System.out.print(i+".["+m.group(i)+"]");
            }
            System.out.println();
        }

    }
}
