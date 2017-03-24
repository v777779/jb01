package ch11.ex16.local;

import lib.utils.Range;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");

        System.out.println("\nSet  Check\n");

        Set<Integer> set = new HashSet<>(); // реализованы методы быстрого доступа к множеству
        Set<Integer> setLHS = new LinkedHashSet<>(); // реализованы методы быстрого доступа к множеству
        Set<Integer> setTS = new TreeSet<>(); // реализованы методы быстрого доступа к множеству
        int[] setArray = new int[25];

        for (int i = 0; i < 10000; i++) {
            int value = Range.getInt(30);
//            set.add(Range.getInt(30)); // заполнить 10К случайных значений от 0 до 99
            set.add(value);
            setLHS.add(value);
            setTS.add(value);
            if (i < setArray.length) {
                setArray[i] = value;
            }

        }
        System.out.println("Set collection:");
        System.out.println(set+" > HashSet");
        System.out.println(setLHS+" > LinkedHashSet");
        System.out.println(setTS+" > TreeSet");

        System.out.println(Arrays.toString(setArray));

        System.out.println("\nSet Contains Check\n");
        Set<String> set1 = new HashSet<>(); // создать объект Set
        Collections.addAll(set1, new String("A B C D E F G H I J K L").split(" "));

        System.out.println("set1:               > "+set1);
        set1.add("M"); // добавляем новый элемент
        System.out.println("set1:      add(\"M\") > "+ set1);
        System.out.println("set1: contains(\"H\") > "+ set1.contains("H"));
        System.out.println("set1: contains(\"N\") > "+ set1.contains("N"));
        Set<String> set2 = new HashSet<>();                                         // новая коллекция
        Collections.addAll(set2, new String("H I J K L").split(" "));   // добавить символы
        System.out.println("set2:               > "+ set2);
        System.out.println("set1:contsAll(set2) > "+ set1.containsAll(set2)); // есть ли все объекты set2 в set1
        set1.remove("H"); // удалить объект
        System.out.println("set1:   remove(\"H\") > "+ set1);
        System.out.println("set1:contsAll(set2) > "+ set1.containsAll(set2)); // есть ли все объекты set2 в set1
        set1.add("H");
        set1.add("P");
        System.out.println("set1:    add(\"H,P\") > "+ set1);
        set2.add("P");
        System.out.println("set2:      add(\"P\") > "+ set2);
        System.out.println("set1:contsAll(set2) > "+ set1.containsAll(set2)); // есть ли все объекты set2 в set1
        set1.removeAll(set2);
        System.out.println("set1:remveAll(set2) > "+ set1); // есть ли все объекты set2 в set1
        Collections.addAll(set1, new String("X Y Z").split(" "));   // добавить символы
        System.out.println("set1: addAll(\"XYZ\") > "+ set1); // есть ли все объекты set2 в set1




    }
}
