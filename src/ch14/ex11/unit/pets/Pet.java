package ch14.ex11.unit.pets;

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

    @Override
    public String toString() {
        return "<"+this.getClass().getSimpleName()+">";
    }
}
