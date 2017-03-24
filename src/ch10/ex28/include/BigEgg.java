package ch.ex28.include;

/**
 * Created by V1 on 17-Feb-17.
 */
public class BigEgg extends Egg {
     protected class Yolk extends Egg.Yolk{  // наследование внутреннего класса
        public Yolk() {
            System.out.println("BigEgg.Yolk.Constructor");  // конструктор переопределен
        }
        void init() {
            System.out.println("BiggEgg.Yolk.init");  // метод переопределен
        }
    }

    public BigEgg() {
        super();    // нельзя до инициализации вломить свой объект
       System.out.println("BigEgg.Constructor");
        System.out.println("---");

    }

    @Override
    void setY(Egg.Yolk y) {
        super.setY(new Yolk());

    }
}
