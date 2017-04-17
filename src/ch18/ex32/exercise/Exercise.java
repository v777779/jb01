package ch18.ex32.exercise;

import java.util.Map;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Feb-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 32 Map to XML Check\n");

        String fileName = "./src/ch18/ex32/exercise/MapCount.java";
        String fileOut = "./src/ch18/ex32/exercise/MapCount.xml";
        Map<String, Integer> map = MapCount.getMap(fileName);
        System.out.println(map);

        MapCount.makeXML(map, fileOut);
        System.out.println("\nRead Map form XML:");
        MapCount.readDocument(fileOut);


    }
}
