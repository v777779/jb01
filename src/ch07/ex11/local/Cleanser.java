package ch07.ex11.local;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Cleanser {  // класс методы которого будут делегированы
    private String s  = "Cleanser # ";

    void append(String s) {
        this.s += s;
    }
    void dilute() {
        append("dilute() # ");
    }
    void apply() {
        append("apply() # ");
    }
    void scrub() {
        append("scrub() # ");
    }

    void check() {
        dilute();
        apply();
        scrub();
        System.out.println("cl = \n" + this);
    }

    @Override
    public String toString() {
        return s;
    }

}
