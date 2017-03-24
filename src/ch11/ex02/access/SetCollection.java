package ch11.ex02.access;

import lib.utils.Range;

import java.util.*;

/**
 * Created by V1 on 20-Feb-17.
 */
public class SetCollection {
     void checkSet() {
        Set<Integer> treeset = new TreeSet<>() ; // объекты только Integer
         Set<Integer> hashset = new HashSet<>() ; // объекты только Integer

         Collection<Integer> col = new LinkedList<>(); // объекты только Integer

        for (int i = 0; i < 10 ; i++) {
            int r = Range.getInt(10);
            treeset.add(r); // числа от 0 до 9
            hashset.add(r);
            col.add(r);
        }
         System.out.print("TreeSet   > ");
        for (Integer integer : treeset) {
            System.out.printf("%2d,",integer);
        }
         System.out.println();
         System.out.print("Hashset   > ");
         for (Integer integer : hashset) {
             System.out.printf("%2d,",integer);
         }
         System.out.println();

        Collections.sort((List)col);
        System.out.print("ArrayList > ");
        for (Integer integer : col) {
            System.out.printf("%2d,",integer);
        }
        System.out.println();
    }

}
