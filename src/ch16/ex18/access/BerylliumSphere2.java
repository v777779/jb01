package ch16.ex18.access;

/**
 * Created by V1 on 23.03.2017.
 */
public class BerylliumSphere2 {
    private static long counter;
    private long id = counter++;

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Sphere " + id;
    }
}
