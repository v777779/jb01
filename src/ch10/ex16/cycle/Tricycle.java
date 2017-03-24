package ch10.ex16.cycle;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Tricycle implements ICycle {
    @Override
    public void balance() {
        System.out.println("Tricycle.balance");
    }

    public void ride() {
        System.out.println("Tricycle.ride");
    }

    @Override
    public void wheels() {
        System.out.println("Tricycle.wheels");
    }

    public static IFactoryCycle factory = new IFactoryCycle() {
        @Override
        public ICycle getCycle() {
            return new Unicycle();
        }
    };

    public static ICycle getCycle() {
        return new Tricycle();
    }

}
