package ch15.ex28.include;

import lib.fruits.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {

    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nBounds w Super Check\n");

        System.out.println("List super Apple:");
        System.out.println("-----------------");
        List<? super Apple> listApple = new ArrayList<>();  // Базовый тип Apple
        listApple.add(new Apple());         // работает
        listApple.add(new Jonathan());      // работает
//        listApple.add(new Orange());      // не работает
//        listApple.add(new Fruit());          // не работает
        System.out.println("listApple:"+listApple);


        System.out.println("\nList super Apple:");
        System.out.println("-----------------");

        List<? super Fruit> listFruit = new ArrayList<>();  // Базовый тип Apple
        listFruit.add(new Apple());         // работает
        listFruit.add(new Orange());
        listFruit.add(new Fruit());
        System.out.println("listFruit:"+listApple);

        System.out.println("\nArray Fruit[]:");
        System.out.println("-----------------");
        Fruit[] fruits = new Fruit[10];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        fruits[2] = new Fruit();
        System.out.println("fruits:"+Arrays.toString(fruits));

    }
}
