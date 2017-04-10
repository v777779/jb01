package ch18.ex17.exercise;

import lib.utils.TextFile;

import java.util.Map;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 17 Map Check\n");
        String fileName = "./src/ch18/ex17/exercise/CharMap.java";
        Map<Character,Integer> map = CharMap.count(new TextFile(fileName,"\\W+").toString());
        int lines = 1;
        for (Character ch : map.keySet()) {
            System.out.printf("\'%c\'=%-2d  ",ch,map.get(ch));
            if (lines++ % 10 == 0) {
                System.out.println();
            }
        }
    }
}
