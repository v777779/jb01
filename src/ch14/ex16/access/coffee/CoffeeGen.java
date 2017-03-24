package ch14.ex16.access.coffee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by V1 on 10-Mar-17.
 */
public class CoffeeGen implements Generator<Coffee>, Iterable<Coffee> {
    private static List<IFactory<? extends Coffee>> pList = new ArrayList<>();
    private static Random rnd = new Random();
    private int size = 0;

    static {
        pList.add(new Americano.Factory());
        pList.add(new Breve.Factory());
        pList.add(new Capuccino.Factory());
        pList.add(new Latte.Factory());
        pList.add(new Mocha.Factory());
    }

    public CoffeeGen() {
    }

    public CoffeeGen(int size) {
        this.size = size;
    }

    public Coffee next() {  // тип возвращаем случайно бесконечно
            return pList.get(rnd.nextInt(pList.size())).create(); // создать экземпляр случайно
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();   // внутренний класс
    }

    class CoffeeIterator implements Iterator<Coffee> {  // проще говоря перебираем заданное количество кофе порций
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGen.this.next(); // обращение к внешнему классу
        }
    }


}
