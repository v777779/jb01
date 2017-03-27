package ch17.ex01.remote;

import lib.container.Countries;

import java.util.*;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Remote {
    public static void app() {
        System.out.println("\n====REMOTE===");
        System.out.println("\nAbstract Collection Generator Check\n");

        System.out.println("Map with some countries:");
        System.out.println(Countries.capitals(5));
        System.out.println(Countries.names(5));
        System.out.println("\nMap Generator for Map:");
        Map<String, String> hMap = new HashMap(Countries.capitals(3));
        Map<String, String> lhMap = new LinkedHashMap(Countries.capitals(4));
        Map<String, String> tMap = new TreeMap<>(Countries.capitals(5));
        Map<String, String> htMap = new Hashtable<>(Countries.capitals(5));

        System.out.println("hMap :"+hMap);
        System.out.println("lhMap:"+lhMap);
        System.out.println("tMap :"+tMap);
        System.out.println("htMap:"+htMap);

        System.out.println("\nMap Generator for Set:");
        Set<String> hSet = new HashSet<>(Countries.names(3));
        Set<String> lhSet = new HashSet<>(Countries.names(4));
        Set<String> tSet = new HashSet<>(Countries.names(3));

        System.out.println("hSet :"+hSet);
        System.out.println("lhSet:"+lhSet);
        System.out.println("tSet :"+tSet);

        System.out.println("\nMap Generator for List:");
        List<String> aList = new ArrayList<>(Countries.names(5));
        List<String> lList = new LinkedList<>(Countries.names(5));
        System.out.println("aList:"+aList);
        System.out.println("lList:"+lList);


        System.out.println(Countries.capitals().get("BRAZIL"));
        System.out.println(Countries.capitals().get("RUSSIA"));

    }
}
