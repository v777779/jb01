package ch14.ex12.access.coffee;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by V1 on 10-Mar-17.
 */
public class CoffeeGen implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {Latte.class, Mocha.class,
    Capuccino.class, Americano.class,Breve.class };
    private static Random rnd = new Random();
    private int size = 0;

    public CoffeeGen() {

    }

    public CoffeeGen(int size) {
        this.size = size;
    }

    public Coffee next() {  // тип возвращаем случайно бесконечно
        try {
        return(Coffee) types[rnd.nextInt(types.length)].newInstance(); // создать экземпляр случайно с кастингом

        } catch (Exception e) {
            System.out.println("catch: Coffee next() Error");
            throw new RuntimeException();
        }
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
