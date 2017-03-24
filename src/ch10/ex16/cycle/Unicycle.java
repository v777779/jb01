package ch10.ex16.cycle;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Unicycle implements ICycle {
    @Override
    public void ride() {
        System.out.println("Unicycle.ride");
    }

    @Override
    public void wheels() {
        System.out.println("Unicycle.wheels");
    }

    @Override
    public void balance() {
        System.out.println("Unicycle.balance");
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
