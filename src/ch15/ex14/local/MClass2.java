package ch.ex14.local;

/**
 * Created by V1 on 16.03.2017.
 */
public class MClass2 {
    private static long count = 0;
    private final long id = count++;

    @Override
    public String toString() {
        return "MClass2."+id;
    }
}
