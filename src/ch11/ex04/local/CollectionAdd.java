package ch11.ex04.local;

import java.util.*;

/**
 * Created by V1 on 20-Feb-17.
 */
public class CollectionAdd {
    Collection<Integer> collection;
    List<Integer> list;

    void showCollection() {
        System.out.print("Show Collection > ");
        for (Integer integer : collection) {
            System.out.print(integer+" ");
        }
        System.out.println();
    }

    void checkAddCollection() {
        collection = new ArrayList<>(   // создание объекта Collection на базе списка
                Arrays.asList(1,2,3,4,5)                    // добавление списка через asList объект List
        );
        Integer[]  ints =  new Integer[] { 6,7,8,9,10 };    // стандартный массив объектов Integer
        collection.addAll(Arrays.asList(ints));             // добавление массива через asList

        Collections.addAll(collection,11,12,13,14,15);      // работает быстрее но только добавление
        Collections.addAll(collection,ints);                //



        System.out.println("Collection made. size."+collection.size());
    }

    void showList() {
        System.out.print("List > ");
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        System.out.println();
    }

    void checkAddList() {
        list = Arrays.asList(16,17,18,19,20); // создание объекта List на базе списка
        System.out.println("List made. size."+list.size());

        try {
            list.add(129);                                  // выдает ощибку
        } catch (Exception e) {
            System.out.println("list.add(129);  > runtime error  list size is fixed ");
        }

    }

}
