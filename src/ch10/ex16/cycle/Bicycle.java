package ch10.ex16.cycle;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Bicycle implements ICycle {
    public void ride() {
        System.out.println("Bicycle.ride");
    }

    @Override
    public void wheels() {
        System.out.println("Bicycle.wheels");
    }

    @Override
    public void balance() {
        System.out.println("Bicycle.balance");
    }

    public static IFactoryCycle factory = new IFactoryCycle() {
        @Override
        public ICycle getCycle() {
            return new Unicycle();
        }
    };

    public static ICycle getCycle() {
        return new Unicycle();
    }

}
