package ch14.ex15.access.pets;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Ball extends Individual {
    public Ball() {
        super();
    }

    public Ball(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "<"+this.getClass().getSimpleName()+">";
    }
}
