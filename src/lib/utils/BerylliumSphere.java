package lib.utils;

/**
 * Created by V1 on 23.03.2017.
 */
public class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Sphere " + id;
    }
}
