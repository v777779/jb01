package ch09.ex7.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
abstract class Rat implements Rodent {
    public Rat() {
        System.out.print("Rat.Constructor > ");
    }
    @Override
    public void dispose() {
        System.out.println("Rat.dispose");
//        super.dispose();
    }


    @Override
    public String toString() {
        return "Rat{}";
    }


}
