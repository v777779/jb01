package ch18.ex03.access;

import java.util.Map;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 3 File Size Check\n");

        SortedDirList sdList = new SortedDirList("./src/ch18");
        Map<String,Long> map = sdList.map("");
        long size = 0;
        System.out.println("Listing:");
        for (String s : sdList.list()) {
            System.out.println(s);
            size += map.get(s);
        }
        System.out.println("Total file size:"+size);

        System.out.println("\nMap with regex:");
        size = 0;
        for (Map.Entry<String,Long> entry : sdList.map(".+ex02.ac.+").entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
            size += entry.getValue();
        }
        System.out.println("Total file size:"+size);
    }
}
