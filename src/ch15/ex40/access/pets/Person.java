package ch15.ex40.access.pets;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Person extends Individual {
    public Person(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
