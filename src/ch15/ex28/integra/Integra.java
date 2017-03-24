package ch15.ex28.integra;

import lib.fruits.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static <T extends Fruit> void writeTo(List<? super Fruit> list, T obj) {
        list.add(obj);
    }

    public static <T> void writeExact(List<T> list, T obj) {
        list.add(obj);
    }

    public static <T> void writeWildCard(List<? super T> list, T obj) {
        list.add(obj);
    }


    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nWildcard Bounds Check\n");

        List<? super Fruit> list = new ArrayList<>();
        writeTo(list, new Apple());             // basic Class Fruit
        writeTo(list, new Orange());            // basic Class Fruit
        writeTo(list, new Jonathan());          // basic Class Fruit
        writeExact(list, new Apple());
        writeExact(list, new Jonathan());
        writeExact(list, new Orange());
        writeWildCard(list, new Apple());
        writeWildCard(list, new Fruit());
        writeWildCard(list, new Orange());
        System.out.println("list     :" + list);


        List<Apple> listApple = new ArrayList<>();
//        writeTo(listApple, new Apple());      // basic Class Fruit
        writeExact(listApple, new Apple());
        writeExact(listApple, new Jonathan());
        writeWildCard(listApple, new Apple());
//        writeWildCard(listApple, new Fruit());
//        writeWildCard(listApple, new Orange());
        System.out.println("listApple:" + listApple);

        List<Fruit> listFruit = new ArrayList<>();
        writeTo(listFruit, new Apple());        // basic Class Fruit
        writeTo(listFruit, new Orange());       // basic Class Fruit
        writeTo(listFruit, new Jonathan());     // basic Class Fruit

        writeExact(listFruit, new Apple());
        writeExact(listFruit, new Jonathan());
        writeExact(listFruit, new Orange());

        writeWildCard(listFruit, new Apple());
        writeWildCard(listFruit, new Fruit());
        writeWildCard(listFruit, new Orange());

        System.out.println("listFruit:" + listFruit);


    }
}
