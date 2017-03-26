package lib.utils;

import java.util.Comparator;

/**
 * Created by V1 on 23.03.2017.
 */
public class BerylliumSphere implements Comparable<BerylliumSphere> {
    private static long counter;
    private final long id = counter++;
// Generator
    public static IGenerator<BerylliumSphere> gen() {
        return new IGenerator<BerylliumSphere>() {
            @Override
            public BerylliumSphere next() {
                return new BerylliumSphere();
            }
        };
    }
// Comparator
    public static Comparator<BerylliumSphere> getComp() {
        return new Comparator<BerylliumSphere>() {
            @Override
            public int compare(BerylliumSphere o1, BerylliumSphere o2) {
                if (o1.id > o2.id) {
                    return -1;
                }
                if (o1.id < o2.id) {
                    return 1;
                }
                return 0;
            }
        };
    }
// Comparable
    @Override
    public int compareTo(BerylliumSphere o) {
        if (id < o.id) {
            return -1;
        }
        if (id > o.id) {
            return 1;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Sphere " + id;
    }

}
