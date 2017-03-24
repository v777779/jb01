package ch.ex18.local;

import lib.utils.IGenerator;

/**
 * Created by V1 on 17.03.2017.
 */
public class Customer {
    private static long counter = 1;
    private final long id = counter++;

    public Customer() {
    }

    public static IGenerator<Customer> generator() {  // внутренний класс как возврат функции
        return  new IGenerator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }

    @Override
    public String toString() {
        return "BigFish." + id;
    }
}
