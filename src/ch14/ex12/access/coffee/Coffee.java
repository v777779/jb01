package ch14.ex12.access.coffee;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Coffee {
    private static long counter = 0;
    private final long id =counter++;

    @Override
    public String toString() {
        return String.format("%-10s %2d",getClass().getSimpleName(),id);
    }
}
