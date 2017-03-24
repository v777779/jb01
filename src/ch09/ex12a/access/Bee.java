package ch.ex12a.access;

/**
 * Created by V1 on 13-Feb-17.
 */
public class Bee implements Poison,Fly{
    @Override
    public void fly() {
        System.out.println("Bee.fly");
    }

    @Override
    public void sting() {
        System.out.println("Bee.sting");
    }

    @Override
    public void born() {
        System.out.println("Bee.born");
    }

    @Override
    public void attack() {
        System.out.println("Bee.attack");
    }

    @Override
    public void move() {

    }
}
