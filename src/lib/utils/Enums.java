package lib.utils;

import java.util.Random;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class Enums {
    private static Random rnd = new Random();

    public static <T> T random(T[] values) {
        return values[rnd.nextInt(values.length)];
    }

    public static <T extends Enum> T random(Class<T> eClass) {
        return random(eClass.getEnumConstants());
    }

    public static <T extends Enum> T random2(Class<T> eClass) {
        T[] values = eClass.getEnumConstants();
            return values[rnd.nextInt(values.length)];
    }

}
