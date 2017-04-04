package ch17.ex42.local;

import lib.maps.Countries;

import java.util.*;

/**
 * Created by V1 on 04-Apr-17.
 */
public class ReadOnly {
    private static Random rnd = new Random();
    private static int from = rnd.nextInt(40);
    private static int to = from + rnd.nextInt(5) + 5;
    public static Collection<String> c = new ArrayList<>(Countries.names(50).subList(from, to));

    private static <C extends Collection> void check(C c) {

    }

    public static void constCollection() {

        System.out.println("Collection:");
        Collection<String> col = Collections.unmodifiableCollection(new ArrayList<>(c));
        System.out.println("col:" + col);
        try {
            col.add("NewData");
        } catch (Exception e) {
            System.out.println("catch: unmodifiable collection");
        }
        System.out.println("mod:" + col);

        System.out.println("\nList:");
        List<String> list = Collections.unmodifiableList(new ArrayList<>(c));
        System.out.println("list:" + list);
        ListIterator<String> lit = list.listIterator();
        System.out.println(lit.next());
        try {
            lit.add("NewData");
        } catch (Exception e) {
            System.out.println("catch: unmodifiable collection");
        }
        System.out.println("mod:" + list);

        System.out.println("\nSet:");

        List<String> list2 = new ArrayList<>(c);
        Collections.shuffle(list2);
        Set<String> hSet = Collections.unmodifiableSet(new HashSet(list2));

        System.out.println("set:" + hSet);
        try {
            hSet.add("NewData");
        } catch (Exception e) {
            System.out.println("catch: unmodifiable collection");
        }
        System.out.println("mod:" + hSet);

        System.out.println("\nSortedSet:");
        Set<String> tSet = Collections.unmodifiableSortedSet(new TreeSet(list2));
        System.out.println("set:" + tSet);
        try {
            hSet.add("NewData");
        } catch (Exception e) {
            System.out.println("catch: unmodifiable collection");
        }
        System.out.println("mod:" + tSet);

        System.out.println("\nMap:");
        TreeMap<String,String> map = new TreeMap<>(Countries.capitals(50));
        Collections.sort(list2);
        TreeMap<String,String> sMap = new TreeMap<>(map.subMap(list2.get(0),list2.get(list2.size()-1)));

        System.out.println(sMap.size());
        System.out.println(list2);
        Map<String,String> hMap = Collections.unmodifiableMap(new HashMap<>(sMap.descendingMap()));
        System.out.println("map:" + hMap);
        try {
            hMap.put("NewKey","NewData");
        } catch (Exception e) {
            System.out.println("catch: unmodifiable collection");
        }
        System.out.println("mod:" + hMap);

        System.out.println("\nSortedMap:");
        Map<String,String> tMap =  Collections.unmodifiableSortedMap(new TreeMap<>(hMap));
        System.out.println("map:" + tMap);
        try {
            tMap.put("NewKey","NewData");
        } catch (Exception e) {
            System.out.println("catch: unmodifiable collection");
        }
        System.out.println("mod:" + tMap);

    }

}
