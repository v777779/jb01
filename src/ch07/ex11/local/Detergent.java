package ch07.ex11.local;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Detergent{  // класс который будет делегировать методы другого класса
    private Cleanser cleanser = new Cleanser();
    private String s = "Detergent $ ";

    public void append(String string) {             // делегированный метод
        cleanser.append(string);
    }
    public void dilute() {                         // делегированный метод
        cleanser.dilute();
    }
    public void apply() {                           // делегированный метод
        cleanser.apply();
    }
    public void scrub() {                           // делегированный метод
        cleanser.scrub();
    }
    public void foam() {                       // новый метод
        append("foam() $ ");              // вызов метода предка
    }

    public void check() {
        dilute();
        apply();
        scrub();
        foam();
        System.out.println("dt = \n" + this);
    }


    @Override
    public String toString() {
        return  s + " "+ cleanser.toString();
    }

}
