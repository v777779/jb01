package ch15.ex08.access.actors;

/**
 * Created by V1 on 10-Mar-17.
 */
public class StoryCh {
    private static long counter = 0;
    private final long id =counter++;

    @Override
    public String toString() {
        return String.format("%-10s.%-10s",getClass().getSimpleName(),getClass().getSuperclass().getSimpleName());
    }
}
