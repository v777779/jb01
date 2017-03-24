package ch15.ex18.local;

import lib.utils.IGenerator;

/**
 * Created by V1 on 17.03.2017.
 */
public class Teller {
    private static long counter = 1;
    private final long id = counter++;

    public Teller() {
    }

    public static IGenerator<Teller> generator() {  // внутренний класс как возврат функции
        return  new IGenerator<Teller>() {
            @Override
            public Teller next() {
                return new Teller();
            }
        };
    }

    @Override
    public String toString() {
        return "Teller." + id;
    }
}
