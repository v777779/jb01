package ch15.ex29.access;

import lib.utils.Holder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void f1(Holder<List<?>> h) {
        List<?> list;
        List<?> list2;

        list = h.getValue();
//        list.add("str"); // не работает
        System.out.println("list:"+list);
        list.remove(0);
        h.setValue(list);
        list2 =  h.getValue();
        System.out.println("list2:"+list2);

    }
    public static void f2(List<Holder<?>> list) {
        Holder<?> h;
        Holder<?> h2;

        System.out.println("list:"+list);
        h = list.get(0);
        System.out.println("h:"+h.getValue());
        list.remove(0);
//        h.setValue("12");
//        h.setValue(list);
        System.out.println("h2:"+list.get(1));
        System.out.println("list:"+list);

    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise Check\n");

        System.out.println("Holder<List<?>>:");
        List<String> list = new ArrayList<>(Arrays.asList("String value don't usig start".split(" ")));
        f1(new Holder<>(list));

        System.out.println("List<Holder<?>>:");
        List<Holder<?>> list2 = new ArrayList<>();
        list2.add(new Holder<>("str1"));
        list2.add(new Holder<>("str2"));
        list2.add(new Holder<>("str3"));
        list2.add(new Holder<>("str4"));
        f2(list2);


    }
}
