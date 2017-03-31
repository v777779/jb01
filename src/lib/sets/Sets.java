package lib.sets;

import lib.generate.GenList;
import lib.generate.GenRnd;
import lib.maps.Countries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created by V1 on 30-Mar-17.
 */
public class Sets {
    public static void checkInt(Set<Integer> set) {
        System.out.println(set.getClass().getSimpleName() + ":");
        List<Integer> list = new GenList<>(new GenRnd.GenInt(100), 25);
        set.addAll(list);    // GenList  List с заполненными данными
        System.out.println(set);
        System.out.println("size:"+set.size());
        set.addAll(list);    // GenList  List с заполненными данными
        System.out.println(set);
        System.out.println("size:"+set.size());

        Integer[] ints = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(ints));


        System.out.println(set);
        System.out.println("contains(" + ints[11] + ") :" + set.contains(ints[11]));

        Integer key = set.iterator().next();
        System.out.println("First key        :" + key);
        set.remove(key);
        System.out.println("First key removed:");
        System.out.println(set);
        System.out.println("size:"+set.size());
        set.add(125);
        System.out.println("Key added:125");
        System.out.println(set);
        System.out.println("size:"+set.size());
        System.out.println("isEmpty()           :" + set.isEmpty());

        set.clear();
        System.out.println("set.clear():");
        System.out.println("isEmpty()           :" + set.isEmpty());
        System.out.println("size:"+set.size());

        set.addAll(list);
        System.out.println(set);
        System.out.println("size:"+set.size());

        System.out.println("isEmpty()           :" + set.isEmpty());
        set.removeAll(set); // удаление через keyset
        System.out.println("set.removeAll():");
        System.out.println("size:"+set.size());
        System.out.println("isEmpty()           :" + set.isEmpty());
        System.out.println();

    }

    public static void checkStr(Set<String> set) {
        System.out.println(set.getClass().getSimpleName() + ":");
        List<String> list = new ArrayList<>(Countries.names(50)).subList(20, 35);
        set.addAll(list); // List с заполненными данными
        System.out.println(set);
        System.out.println("size:"+set.size());

        set.addAll(list); // List с заполненными данными
        System.out.println(set);
        System.out.println("size:"+set.size());

        String[] strings = set.toArray(new String[0]);  // заполнить массив строк
        System.out.println(Arrays.toString(strings));

        System.out.println("contains(" + strings[11] + ") :" + set.contains(strings[11]));

        String key = set.iterator().next();
        System.out.println("First key        :" + key);
        set.remove(key);
        System.out.println("First key removed:");
        System.out.println(set);
        System.out.println("size:"+set.size());

        set.add("TUSKANA");
        System.out.println("Key added:TUSKANA");
        System.out.println(set);
        System.out.println("size:"+set.size());
        System.out.println("isEmpty()           :" + set.isEmpty());

        set.clear();
        System.out.println("set.clear():");
        System.out.println("isEmpty()           :" + set.isEmpty());
        System.out.println("size:"+set.size());

        set.addAll(list);
        System.out.println(set);
        System.out.println("size:"+set.size());

        System.out.println("isEmpty()           :" + set.isEmpty());
        set.removeAll(set); // удаление через keyset
        System.out.println("set.removeAll():");
        System.out.println("size:"+set.size());
        System.out.println("isEmpty()           :" + set.isEmpty());
        System.out.println();
    }

}
