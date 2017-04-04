package ch17.ex42.integra;

import lib.maps.Countries;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by V1 on 04-Apr-17.
 */
public class FailFast {

    public static void check() {
        List<String> list = new ArrayList<>(Countries.names(10));
        System.out.println(list);

        System.out.println("Iterator    :");
        Iterator<String> it = list.iterator();
        list.add("NewData");
        try {
            while (it.hasNext()) {
                System.out.print(it.next()+" : "); // устаревший итератор
            }
        } catch (Exception e) {
            System.out.println("catch: iterator obsoleted");
        }
        System.out.println("Iterator new:");
        it = list.iterator();
        list.add("NewData");
        it = list.iterator();
        try {
            while (it.hasNext()) {
                System.out.print(it.next()+" : "); // обновленный итератор
            }
        } catch (Exception e) {
            System.out.println("catch: iterator obsoleted");
        }
        System.out.println();
        System.out.println(list);

    }

}
