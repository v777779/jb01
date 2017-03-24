package ch.ex28.remote;

import lib.fruits.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 20-Feb-17.
 */
public class GenericWriting {

   List<Apple> listApple = new ArrayList<>();
   List<Fruit> ListFruit = new ArrayList<>();

    public <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    public <T> void writeWildCard(List<?super T> list, T item) {
        list.add(item);
    }

    public void f1() {
        writeExact(listApple, new Apple());
        writeExact(listApple, new Apple());
        writeExact(listApple, new Apple());
//        writeExact(listApple, new Orange()); // не работает

        writeExact(ListFruit, new Apple());    // работает
        writeExact(ListFruit, new Orange());  // работает
        writeExact(ListFruit, new Fruit());   // работает
        writeExact(ListFruit, new Orange());  // работает
        writeExact(ListFruit, new Jonathan());    // работает
    }

    public void f2() {
        writeWildCard(listApple, new Apple());
//        writeWildCard(listApple, new Orange()); // не работает

        writeWildCard(ListFruit, new Apple());    // работает
        writeWildCard(ListFruit, new Orange());  // работает
        writeWildCard(ListFruit, new Fruit());   // работает
    }

    public void app() {
        System.out.println("\nBounds Wilcard <? super T> Check\n");

        f1();
        f2();
        System.out.println("listApple:"+ listApple);
        System.out.println("ListFruit:"+ ListFruit);
    }
}
