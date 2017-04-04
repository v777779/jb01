package ch17.ex01.access;

import lib.maps.Countries;

import java.util.*;

/**
 * Created by V1 on 8-Feb-17.
 */
public class Access {
    public static List<String[]> fill(List<String[]> list, int size) {
        Map<String, String> map = Countries.capitals(size);
        for (String s : map.keySet()) {
            list.add(new String[]{s, map.get(s)});
        }
        return list;
    }

    public static void showList(List<String[]> list) {
        for (String[] strings : list) {
            System.out.print(Arrays.deepToString(strings));
        }
        System.out.println();
    }


    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 1 Check\n");


        System.out.println("\nArrayList shuffle:");
        List<String[]> list = new ArrayList<>();
        fill(list, 5);

        for (int i = 0; i < 3; i++) {
            System.out.print("shuffle:");
            Collections.shuffle(list);
            showList(list);
        }

        System.out.println("\nLinkedList shuffle:");
        List<String> bList = new LinkedList<>(Countries.names(15));
        Collections.sort(bList);
        System.out.println("sorted :" + bList);

        for (int i = 0; i < 3; i++) {
            Collections.shuffle(bList);
            System.out.println("shuffle:" + bList);

        }


    }
}
