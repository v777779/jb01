package ch10.ex28.local;

/**
 * Created by V1 on 17-Feb-17.
 */
public class BigEgg extends Egg {
    private Yolk y;
    public class Yolk {
        private String name;
        public Yolk() {
            System.out.println("BigEgg.Yolk.Constructor");
        }
    }

    public BigEgg() {

        System.out.println("BigEgg.Constructor");
    }

}
