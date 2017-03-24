package ch.ex12.access;

/**
 * Created by V1 on 13-Feb-17.
 */
public class Hero extends ActionCharacter implements CanFight, CanSweem, CanFly, CanClimb {

    @Override
    public void fly() {
        System.out.println("Hero.fly");
    }

    @Override
    public void climb() {
        System.out.println("Hero.climb");
    }

    @Override
    public void sweem() {
        System.out.println("Hero.swim");
    }
}
