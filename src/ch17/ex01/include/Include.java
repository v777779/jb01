package ch17.ex01.include;

import lib.generate.GenRnd;

import java.util.*;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nGenerator for Collection Check\n");

        System.out.println("Initialization Set with IGenerator:");
        List<String> listGen = new CData<>(new GenGov(), 25); // генератор и список
        Set<String> lhset = new LinkedHashSet<>( listGen);
        System.out.println(listGen);
        System.out.println(lhset);

        System.out.println("Additional Method:");
        lhset.addAll(new CData<>(new GenGov(), 15));
        System.out.println(lhset);

        System.out.println("\nArrayList<> Generator Random String:");
        ArrayList<String> aList = CData.getList(new GenRnd.GenStr(9), 10);
        System.out.println(aList);

        System.out.println("\nHashSet<> Generator Random Integer:");
        Set<Integer> hset = new HashSet<>(CData.getList(new GenRnd.GenInt(),10));
        System.out.println(hset);

        System.out.println("\nTreeSet<> Generator Random Integer:");
        Set<Integer> tset = new TreeSet<>(CData.getList(new GenRnd.GenInt(),10));
        System.out.println(tset);


    }
}
