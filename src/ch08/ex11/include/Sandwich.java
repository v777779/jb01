package ch08.ex11.include;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Sandwich extends Portable {
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();

    public Sandwich() {
        System.out.println("Sandwich.Sandwich");
    }
}
