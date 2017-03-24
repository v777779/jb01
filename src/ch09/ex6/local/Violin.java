package ch.ex6.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Violin implements Cargo {
    public Violin() {
        System.out.println("Violin.Constructor");
    }

    @Override
    public String toString() {
        return "Violin{}";
    }

//    @Override
//    void weight() {  // не работает, так как методы Cargo public
//        System.out.println("Violin.weight");
//    }

    @Override
    public void weight() {
        System.out.println("Violin.weight");
    }


    @Override
    public void move() {
        System.out.println("Violin.move");
    }

    @Override
    public void check() {
        System.out.println("Violin.check");
    }
}
