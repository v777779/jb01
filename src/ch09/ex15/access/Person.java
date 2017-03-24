package ch.ex15.access;

/**
 * Created by V1 on 13-Feb-17.
 */
public class Person extends Stuff implements Builder {
    @Override
    public void mode() {
        System.out.println("Person.mode");
    }

    @Override
    public void airStart() {
        System.out.println("Person.airStart");
    }

    @Override
    public void gasStart() {
        System.out.println("Person.gasStart");
    }

    @Override
    public void waterStart() {
        System.out.println("Person.waterSatrt");
    }

    @Override
    public void airStop() {
        System.out.println("Person.airStop");
    }

    @Override
    public void gasStop() {
        System.out.println("Person.gasStop");
    }

    @Override
    public void waterStop() {
        System.out.println("Person.waterStop");
    }

    @Override
    public void buildStart() {
        System.out.println("Person.buildStart");
    }

    public void activity() {
        System.out.println("Person.activity");
    }
}
