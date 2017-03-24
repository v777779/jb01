package ch07.ex02;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Sterilizer extends Detergent {
    private String s = "Sterilizer % ";

    void scrub() {
        append ( " Sterilizer.scrub()");
        super.scrub();
    }

    void sterilize() {
        append(" sterilize() %");
    }

    void check() {
        dilute();
        apply();
        scrub();
        foam();
        sterilize();
        System.out.println("st = \n" + this);

    }


    @Override
    public String toString() {
        return "St_toString: "+s + super.toString();
    }
}
