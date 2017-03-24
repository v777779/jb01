package ch15.ex14.access;

/**
 * Created by V1 on 16.03.2017.
 */
public class MClass {
    private static long count = 0;
    private final long id = count++;

    @Override
    public String toString() {
        return "MClass."+id;
    }
}
