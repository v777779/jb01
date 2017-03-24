package ch14.ex11.value.pets;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Individual {
    private static long count;
    protected static final long id = count++;
    protected String name;

    public Individual() {
    }

    public Individual(String name) {
        this.name = name;
    }
}
