package ch17.ex42.include;

import lib.maps.Countries;

import java.util.*;

/**
 * Created by V1 on 04-Apr-17.
 */
public class Sync {

    public static void check() {

        System.out.println("Synchronized Collection:");
        Collection<String> col = Collections.synchronizedCollection(new ArrayList<>(Countries.names(10)));
        System.out.println(col);

        System.out.println("Synchronized List:");
        List<String> list = Collections.synchronizedList(new ArrayList<>(Countries.names(10)));
        System.out.println(list);
        System.out.println("Synchronized Set:");
        Set<String> hSet = Collections.synchronizedSet(new HashSet<>(list));
        System.out.println(hSet);
        System.out.println("Synchronized SortedSet:");
        Set<String> tSet = Collections.synchronizedSortedSet(new TreeSet<>(list));
        System.out.println(tSet);
        System.out.println("Synchronized Map:");
        Map<String,String> hMap = Collections.synchronizedMap(new HashMap<>(Countries.capitals(10)));
        System.out.println(hMap);
        System.out.println("Synchronized SortedMap:");
        Map<String,String> tMap = Collections.synchronizedSortedMap(new TreeMap<>(hMap));
        System.out.println(tMap);


    }
}
