package lib.coffee;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Coffee implements Comparable<Coffee> {
    private static long counter = 0;
    private final long id = counter++;

    public long getId() {
        return id;
    }

    @Override
    public int compareTo(Coffee o) {
        String type = getClass().getSimpleName();
        String typeO = o.getClass().getSimpleName();
        int cmp = type.compareTo(typeO);
        if (cmp != 0) {
            return cmp;
        }
        return (id < o.getId() ? -1 : (id == o.getId() ? 0 : 1));
    }

    @Override
    public String toString() {
        return String.format("%d.%s", id, getClass().getSimpleName());
    }


}
