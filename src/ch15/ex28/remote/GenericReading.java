package ch.ex28.remote;

import lib.fruits.Apple;
import lib.fruits.Fruit;

import java.util.List;

/**
 * Created by V1 on 20.03.2017.
 */
public class GenericReading {

    List<Apple> listApple;
    List<Fruit> listFruit;

    public GenericReading(List<Apple> listApple, List<Fruit> listFruit) {
        this.listApple = listApple;
        this.listFruit = listFruit;
    }

    public <T> T readCovariant(List<? extends T> list, int index) {
        return list.get(index);
    }

    public <T> T readExact(List<T> list, int index) {
        return list.get(index);
    }

    public void f1() {
        System.out.println("\nCommon Class f1():");

        Apple a = readExact(listApple, 1);
//      a = readExact(listFruit, 2);  // не работает

        Fruit f = readExact(listFruit, 1);
        Fruit fb = readExact(listApple, 2);


        Apple ac = readCovariant(listApple, 0);
//      ac = readCovariant(listFruit, 2);  // не работает

        Fruit fc = readCovariant(listFruit, 2);
        Fruit fd = readCovariant(listApple, 3);

        System.out.println("ReadExact    :" + a + " " + f + " " + fb);
        System.out.println("ReadCovariant:" + ac + " " + fc + " " + fd);

    }

    class ReaderExact<T> {
        public T readExact(List<T> list, int index) {
            return list.get(index);
        }

        public <T> T readExactT(List<T> list, int index) {
            return list.get(index);
        }


    }

    class ReaderCovariant<T> {
        public T readCovariant(List<? extends T> list, int index) {
            return list.get(index);
        }

        public <T> T readCovariantT(List<? extends T> list, int index) {
            return list.get(index);
        }

    }

    public void f2() {
        System.out.println("\nCommon Class f2():");

        ReaderExact<Fruit> fre = new ReaderExact<>();
        Fruit ff  = fre.readExact(listFruit, 7);
//        Fruit fa = fr.readExact(listApple, 2);   // не работает так как класс создан для Fruit
        Fruit fb = fre.readExactT(listApple,2); // работает так как на уровне метода независимая типизация
        System.out.println("ReaderExact:"+ff+" "+fb);

    }

    public void f3() {
        System.out.println("\nCommon Class f3():");


        ReaderCovariant<Fruit> frc = new ReaderCovariant<>();
        Fruit ff  = frc.readCovariant(listFruit, 4);
        Fruit fa = frc.readCovariant(listApple, 2);     // работает так как класс создан для <? extends Fruit>
        Fruit fb = frc.readCovariantT(listApple,3);     // работает так как на уровне метода независимая типизация
        System.out.println("ReaderCovariant:"+ff+" "+fa+" "+fb);

    }

    public void app() {
        System.out.println("\nBounds Wilcard <? extends T> Check\n");
        f1();
        f2();
        f3();

    }

}
