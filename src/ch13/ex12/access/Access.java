package ch13.ex12.access;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 12 Groups Check\n");
        String poem = "Twas brillig, and the slithy toves\n" +
                "Did gyre and gimble in the wabe.\n" +
                "All mimsy were the borogoves,\n" +
                "And the mome raths outgrabe.\n\n" +
                "Beware the Jabberwock, my son,\n" +
                "The jaws that bite, the claws that catch.\n" +
                "Beware the Jubjub bird, and shun\n" +
                "The frumious Bandersnatch.";

        String regex = "(\\b\\p{javaLowerCase}\\w+)";  // групповое разбиение нужно для анализа
//        String regex = "\\b((?=[A-Z])\\w+)";           // (?=[A-Z] по границам слов с прописной буквы
//        String regex = "\\b((?![A-Z])\\w+)";           // (?![A-Z] по границам слов со строчной буквы

        Matcher m = Pattern.compile(regex).matcher(poem);
        Set<String> hset = new HashSet<>();

        while (m.find()) {
            hset.add(m.group());
//            System.out.printf("%-15s\n", m.group());
        }
//        System.out.println();

        Set<String> tset = new TreeSet<>(hset); // сразу сортировать
        System.out.println("Unic words:" + hset.size());
        int k = 1;
        for (String s : tset) {
            System.out.printf("%-15s", s);
            if ((k++ % 10) == 0)
                System.out.println();
        }
    }
}
