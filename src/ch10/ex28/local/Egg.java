package ch.ex28.local;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Egg {
    private Yolk y;
    public class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk.Constructor");
        }
    }

    public Egg() {
        System.out.println("Egg.Constructor");
        this.y = new Yolk();  // строит текущий класс из своего конструктора
    }

}
