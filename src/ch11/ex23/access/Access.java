package ch11.ex23.access;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 23  Check\n");

        Stat st = new Stat();
        Iterator<Number> itset = st.getItSet();
        System.out.println("TreeSet Version:");
        int k=1;
        while (itset.hasNext()) {
            System.out.print(itset.next());
            if ((k++ % 5) == 0) {
                System.out.println();
                break;
            }
        }
// Plan
// заполнить HashMap значениями Random
// вытащить карту в ArrayList <Number>   <> в TreeSet
// сортировать ArrayList по нашему компаратору
// вывести ArrayList
        System.out.println("\nOfficial solution\n");
        ArrayList<Number> list = new ArrayList<>();
        Iterator <Map.Entry<Integer,Integer>> it = st.getMap().entrySet().iterator();  // получили итератор по Map
        while (it.hasNext()) {
            Map.Entry<Integer,Integer> entry = it.next();
            list.add(new Number(entry.getKey(),entry.getValue())); // добавили объект
        }

        System.out.println("Unsorted:"+list);
        Collections.sort(list); // отсортировали list по компаратору
        System.out.println("  Sorted:"+list);


    }
}
