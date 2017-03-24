package ch.ex18.access;

import lib.utils.IGenerator;

/**
 * Created by V1 on 17.03.2017.
 */
public class SmallFish {
    private static long counter = 1;
    private final long id = counter++;

    public SmallFish() {
    }

    public static IGenerator<SmallFish> generator() {  // внутренний класс как возврат функции
        return  new IGenerator<SmallFish>() {
            @Override
            public SmallFish next() {
                return new SmallFish();
            }
        };
    }

    @Override
    public String toString() {
        return "SmallFish." + id;
    }
}
