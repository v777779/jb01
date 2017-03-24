package ch07.ex19;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Leaf {
    String color;
    public Leaf(String color) {
        this.color = color;
        System.out.print("Leaf.Leaf>"+color+" ");

    }

    @Override
    public String toString() {
        return color;
    }
}
