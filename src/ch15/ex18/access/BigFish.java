package ch.ex18.access;

import lib.utils.IGenerator;

/**
 * Created by V1 on 17.03.2017.
 */
public class BigFish {
    private static long counter = 1;
    private final long id = counter++;

    public BigFish() {
    }

    public static IGenerator<BigFish> generator() {  // внутренний класс как возврат функции
        return  new IGenerator<BigFish>() {
            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }

    @Override
    public String toString() {
        return "BigFish." + id;
    }
}
