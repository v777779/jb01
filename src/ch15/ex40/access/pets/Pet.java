package ch.ex40.access.pets;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Pet extends Individual {
    public Pet() {
        super();
    }

    public Pet(String name) {
        super(name);
    }

    public void speak() {
    }

    @Override
    public String toString() {
        return "<" + this.getClass().getSimpleName() + ">";
    }
}
