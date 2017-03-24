package ch07.ex2;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Detergent extends Cleanser {
    private String s = "Detergent $ ";


    void scrub() {
        append("Detergent.scrub() $ ");   // вызов метода предка
        super.scrub();                  // вызов метода предка
    }

    void foam() {                       // новый метод
        append("foam() $ ");              // вызов метода предка
    }

    void check() {
        dilute();
        apply();
        scrub();
        foam();
        System.out.println("dt = \n" + this);

    }


    @Override
    public String toString() {
        return "Dt_toString: "+ s + super.toString();
    }

}
