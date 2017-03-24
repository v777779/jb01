package ch.ex28.local;

import lib.fruits.Apple;
import lib.fruits.Fruit;
import lib.fruits.Jonathan;
import lib.fruits.Orange;
import lib.utils.Holder;

import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nWildCard Compilator Check\n");

        System.out.println("List<?extendes Fruit> : ");
        System.out.println("------------------------");
        List <?extends Fruit> flist = Arrays.asList(new Apple(), new Orange(), new Jonathan());
//        list.add(new Apple()); // не работает
        Apple a1 = (Apple)flist.get(0);
        System.out.println("contains:"+flist.contains(new Apple()));  // не распознает
        System.out.println("indexof :"+flist.indexOf(new Apple()));   // не распознает

        System.out.println("contains:"+flist.contains(a1));  // не распознает
        System.out.println("indexof:"+flist.indexOf(a1));   // не распознает


        System.out.println("flist size:"+flist.size());
        System.out.println(flist);
        for (Fruit fruit : flist) {
            System.out.println(fruit.getClass());
        }
        System.out.println("\nHolder<T> :             ");
        System.out.println("------------------------");
        Holder<Apple> hApple = new Holder<>(new Apple());       // тип хранения Apple
        Holder<Orange> hOrange = new Holder<>(new Orange());    // тип хранения Orange

        Apple apple = hApple.getValue();    // получаем
        Orange orange = hOrange.getValue();
        hApple.setValue(apple);             // возвращаем
//        Holder<Fruit> hFruit = hApple;      // не работает ссылка так как разный тип хранения

        Holder<?extends Fruit> hFruit = hApple;      // работает ссылка так как разный тип хранения
        Fruit fruit = hFruit.getValue();                // вытащить фрукт по ссылке
        System.out.println("fruit:"+fruit);             // вытаскивает нормально
        apple = (Apple)hFruit.getValue();
        System.out.println("apple:"+apple);             // вытаскивает нормально

//       Orange orange = (Orange)hFruit.getValue();      // ломаем типы не работает
//        hFruit.setValue(new Apple()); // не работает
//        hFruit.setValue(new Fruit()); // не работает
        System.out.println("hFruit<>apple:"+hFruit.equals(apple));

        hFruit = hOrange;
        System.out.println("hFruit<>orange:"+hFruit.equals(orange));


    }
}
