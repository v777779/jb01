package ch15.ex40.local;

import lib.pets.Dog;

/**
 * Created by V1 on 22.03.2017.
 */
public class PerformDog extends Dog implements IPerform {
    @Override
    public void speak() {
        System.out.println("PerformDog.speak");
    }

    @Override
    public void sit() {
        System.out.println("PerformDog.sit");
    }

    public void reproduce() {
        System.out.println("PerformDog.reproduce");
    }
}
