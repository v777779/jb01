package ch15.ex41.local;

/**
 * Created by V1 on 23.03.2017.
 */
public class Contract {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName()+" "+ id;
    }
}
