package ch.ex17.include;

import lib.coffee.CoffeeGen;
import lib.utils.IGenerator;

import java.util.*;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nSet w Generics Check\n");
        Set<String> tset = CMDiff.methodSet(IGenerator.class);
        System.out.println(tset);
        System.out.println("\n Class Methods:");
        CMDiff.difference(CoffeeGen.class, Iterable.class);
        System.out.println("----------------------------");
        System.out.println("\nCollection: "+ CMDiff.methodSet(Collection.class));
        CMDiff.interfaces(Collection.class);
        System.out.println("----------------------------");
        CMDiff.difference(Set.class, Collection.class);
        System.out.println("----------------------------");
        CMDiff.difference(HashSet.class, Set.class);
        System.out.println("----------------------------");
        CMDiff.difference(LinkedHashSet.class, HashSet.class);
        System.out.println("----------------------------");
        CMDiff.difference(TreeSet.class, Set.class);
        System.out.println("----------------------------");
        CMDiff.difference(List.class, Collection.class);
        System.out.println("----------------------------");
        CMDiff.difference(ArrayList.class, List.class);
        System.out.println("----------------------------");
        CMDiff.difference(LinkedList.class, List.class);
        System.out.println("----------------------------");
        CMDiff.difference(Queue.class, Collection.class);
        System.out.println("----------------------------");
        CMDiff.difference(PriorityQueue.class, Queue.class);
        System.out.println("----------------------------");
        System.out.println("\nMap:"+ CMDiff.methodSet(Map.class));
        System.out.println("----------------------------");
        CMDiff.difference(HashMap.class, Map.class);
        System.out.println("----------------------------");
        CMDiff.difference(LinkedHashMap.class, HashMap.class);
        System.out.println("----------------------------");
        CMDiff.difference(SortedMap.class, Map.class);
        System.out.println("----------------------------");
        CMDiff.difference(TreeMap.class, Map.class);

    }
}
