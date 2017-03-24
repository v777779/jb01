package ch.ex8.lunch;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Sandwich extends Portable implements FastFood {
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();

    public Sandwich() {
        System.out.println("Sandwich.Constructor");
    }

    public void pay() {
        System.out.println("Sandwich.pay");
    }

    @Override
    public void getWeight() {
        System.out.println("Sandwich.getWeight");
    }

    @Override
    public void check() {
        System.out.println("Sandwich.check");
    }

    @Override
    public void deliver() {
        System.out.println("Sandwich.deliver");
    }

    @Override
    public void order() {
        System.out.println("Sandwich.order");
    }

}
