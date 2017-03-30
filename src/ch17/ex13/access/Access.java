package ch17.ex13.access;

import lib.utils.TextFile;

import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
     public static String replace(String s) {
         String[]  ss = s.split("\n");
         StringBuilder sb = new StringBuilder();
         for (int i = 0; i < ss.length; i++) {
             sb.append(String.format("%-20s",ss[i]));
             if ((i+1) % 8 == 0) {
                 sb.append("\n");
             }
         }
         return sb.toString();
     }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 13 SimpleMap Check\n");
        List<String> list = new TextFile("src/ch17/ex10/access/SortedLinked.java", "\\W+");
// my  version
        System.out.println("Home Version:");
        SimpleMap2<String, Integer> map2 = new SimpleMap2<>(0); // autosize and count
        for (String s : list) {
            if (map2.get(s) == null) {
                map2.put(s, 1);
            } else {
                map2.put(s, map2.get(s) + 1);
            }

        }
        System.out.println(replace(map2.toString()));

// official  version
        System.out.println("\nOfficial Version:");

        SimpleMap<String, Integer> map = new SimpleMap<>(list.size()); // autosize and count
        for (String s : list) {
            if (map.get(s) == null) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        System.out.println(replace(map.toString()));

    }
}
