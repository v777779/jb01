package ch11.ex02.local;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by V1 on 20-Feb-17.
 */
public class SimpleCollection {
    void checkSimple() {
        Collection<Integer> collection = new ArrayList<>(); // объекты только Integer
        for (int i = 0; i < 10 ; i++) {
            collection.add(i); // числа от 0 до 9
        }
        for (Integer integer : collection) {
            System.out.print(integer+",");
        }
        System.out.println();
    }
    void checkLinked() {
        Collection<Integer> collection = new LinkedList<>(); // объекты только Integer
        for (int i = 0; i < 10 ; i++) {
            collection.add(i); // числа от 0 до 9
        }
        for (Integer integer : collection) {
            System.out.print(integer+",");
        }
        System.out.println();
    }

}
