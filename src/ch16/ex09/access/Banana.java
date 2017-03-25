package ch16.ex09.access;

/**
 * Created by V1 on 25.03.2017.
 */
public class Banana {
    private static long counter = 1;
    private final long id = counter++;

    @Override
    public String toString() {

        return "Banana."+id;
    }
}
