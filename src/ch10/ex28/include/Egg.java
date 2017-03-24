package ch.ex28.include;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Egg {
    private Yolk y;

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk.Constructor");  // конструктор переопределен
        }
        void init() {
            System.out.println("Egg.Yolk.init");  // метод переопределен
        }
    }

    public Egg() {
        System.out.println("Egg.Constructor");
        this.y = new Yolk();            // свой объект сначала
    }

    void setY(Yolk y) {                 // метод оригинальный
        System.out.println("Egg.setY");
        this.y = y;
        System.out.println("---");
    }

    void show() {                       // метод оригинальны
        System.out.print("Egg.show > ");
        y.init();
        System.out.println("---");

    }

}
