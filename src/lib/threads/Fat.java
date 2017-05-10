package lib.threads;

import lib.utils.IGenerator;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Fat {
    private volatile double d;
    private static int counter = 0;
    private final int id = counter++;

    public Fat() {  // типа тяжелый конструктор объекта
        for (int i = 1; i < 10000; i++) {
            d += (Math.PI + Math.E) / (double) i;
        }
    }

    public void operation() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Fat " + id;
    }

    public static class FatFactory implements IGenerator<Fat> {
        @Override
        public Fat next() {
            return new Fat();
        }
    }
}
