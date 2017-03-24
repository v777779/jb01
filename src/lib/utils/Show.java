package lib.utils;

import lib.pets.Pet;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Show {

    public static void showCPet(Collection<Pet> coll) {
        int k = 1;
        System.out.println("Collection elements:");
        for (Pet pet : coll) {
            System.out.printf("%-8s", pet);
            if ((k++ % 8) == 0) {
                System.out.println();
            }
        }
    }

    public static void showCInt(Collection<Integer> coll) {
        int k = 1;
        System.out.println("Collection elements:");
        for (Integer valInt : coll) {
            System.out.printf("%-6d ", valInt);
            if ((k++ % 8) == 0) {
                System.out.println();
            }
        }
    }

    public static void showCStr(Collection<String> coll) {
        int k = 1;
        System.out.println("Collection elements:");
        for (String s : coll) {
            System.out.printf("%-14s ", s);
            if ((k++ % 8) == 0) {
                System.out.println();
            }
        }
    }

    public static void showMapSS(Map<String, String> map) {
        int k = 1;
        System.out.println("Map elements:");
        for (String s : map.keySet()) {
            System.out.printf("%-14s:%-14s  ",s,map.get(s));
            if ((k++ % 8) == 0) {
                System.out.println();
            }
        }

    }

    public static void showMapSI(Map<String, Integer> map) {
        int k = 1;
        for (String s : map.keySet()) {
            System.out.printf("%-14s:%2d  ",s,map.get(s));
            if ((k++ % 8) == 0) {
                System.out.println();
            }
        }

    }

    public static void showPet(Iterator<Pet> it) {
        int k = 1;
        System.out.println("Iterator elements:");
        while(it.hasNext()) {
            Pet pet = it.next();
            System.out.printf("%-8s",pet);
            if (k++ % 10 == 0) {
                k = 1;
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void showDbl(Iterator<Double> it) {
        int k = 1;
        System.out.println("Iterator elements:");
        while(it.hasNext()) {
            Double value = it.next();
            System.out.printf("%6.2f",value);
            if (k++ % 10 == 0) {
                k = 1;
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void showInt(Iterator<Integer> it) {
        int k = 1;
        System.out.println("Iterator elements:");
        while(it.hasNext()) {
            Integer value = it.next();
            System.out.printf("%-6s",value);
            if (k++ % 10 == 0) {
                k = 1;
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void showStr(Iterator<String> it) {
        int k = 1;
        System.out.println("Iterator elements:");
        while(it.hasNext()) {
            String value = it.next();
            System.out.printf("%-16s",value);
            if (k++ % 10 == 0) {
                k = 1;
                System.out.println();
            }
        }
        System.out.println();
    }


     public static void showQ(Queue q) {
        System.out.println("Queue elements:");
        while (q.peek() != null) {
            System.out.print(q.poll()+" "); // первый элемент очереди отдать
        }
        System.out.println();
    }

    public static void showQDbl(Queue q) {
        System.out.println("Queue elements:");
        while (q.peek() != null) {
            System.out.printf("%6.2f",q.poll()); // первый элемент очереди отдать
        }
        System.out.println();
    }

}
