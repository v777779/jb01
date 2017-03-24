package ch.ex40.local;

/**
 * Created by V1 on 22.03.2017.
 */
public class Robot implements IPerform {
    @Override
    public void speak() {
        System.out.println("Robot.speak");
    }

    @Override
    public void sit() {
        System.out.println("Robot.sit");
    }
    public void oilChange() {
        System.out.println("Robot.oilChange");
    }
}
