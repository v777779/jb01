package ch11.ex18.access;

import lib.utils.Range;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 18  Check\n");
        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(new String(String.format("key_%02d",(i+1))),Range.getInt(100));
        }
        System.out.print("HashMap unsorted   :");
        System.out.println(map);
// Original Solution
// get keys to Array
        System.out.println("Original Solution:");
        System.out.println("=================");
        String [] keyArray = map.keySet().toArray(new String[0]); // создать массив пустой длины, он расширит сам

        System.out.println("keyArray unsorted:"+Arrays.toString(keyArray));
        Arrays.sort(keyArray); // отсортировали массив
        System.out.println("keyArray   sorted:"+Arrays.toString(keyArray));
        Map<String,Integer> lhdmap = new LinkedHashMap<>();
        for (String s : keyArray) {
            lhdmap.put(s,map.get(s));
        }
        System.out.println("LinkedHashMap    :"+lhdmap);
        System.out.println("=================");


//Arrays
        System.out.println("Array:");
        String [] sArray = map.keySet().toArray(new String[0]); // создать массив пустой длины, он расширит сам

        System.out.print("sArray unsorted    :");
        System.out.println(Arrays.asList(sArray));
        Arrays.sort(sArray); // отсортировать строки
        System.out.print("sArray   sorted    :");
        System.out.println(Arrays.asList(sArray));

        Map<String,Integer> lhmap = new LinkedHashMap<>();
        for (String s : sArray) {
            lhmap.put(s,map.get(s));
        }
        System.out.print("LinkedHashMap      :");
        System.out.println(lhmap);

//TreeMap
        System.out.println("TreeMap:");
        Map<String,Integer> mapSorted = new TreeMap<>(map); // сортированный по ключу
        System.out.print("TreeMap            :");
        System.out.println(mapSorted);

        System.out.print("LinkedHashMapB     :");
        Map<String,Integer> lhmapB = new LinkedHashMap<>(mapSorted);
        System.out.println(lhmapB);

//ArrayList
        System.out.println("ArrayList:");
        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
//make comparator
        Comparator<Map.Entry<String,Integer>> cmp = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        };
        System.out.print("LinkedList unSorted:");
        System.out.println(list);
        list.sort(cmp);  // сортировка по компаратору
        System.out.print("LinkedList Sorted  :");
        System.out.println(list);

        LinkedHashMap<String,Integer> lhmapC = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : list) {
            lhmapC.put(entry.getKey(),entry.getValue());
        }
        System.out.print("LinkedHashMapC     :");
        System.out.println(lhmapC);

// TreeSet  сортировка
        System.out.println("TreeSet:");
        Set<String> set = new TreeSet<>(map.keySet()); // получить строки сразу сортированные
        System.out.print("Treeset            :");
        System.out.println(set);
        Map<String,Integer> lhmapD = new LinkedHashMap<>();
        for (String s : set) {
            lhmapD.put(s,map.get(s));
        }
        System.out.print("LinkedHashMapD     :");
        System.out.println(lhmapD);

    }
}
