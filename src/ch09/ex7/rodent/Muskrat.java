package ch.ex7.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Muskrat extends Rat implements Rodent {

    public Muskrat() {
        System.out.println("Muskrat.Constructor");
    }

    @Override
    public  void dispose() {
        System.out.println("Muskrat.dispose");
        super.dispose();
    }

    @Override
    public void addRef() {

    }
    @Override
    public void voice() {
        System.out.println("Muskrat.voice");
    }

    @Override
    public void eat() {
        System.out.println("Muskrat.eat");
    }

    @Override
    public void sleep() {
        System.out.println("Muskrat.sleep");
    }

    @Override
    public void run() {
        System.out.println("Muskrat.run");
    }


    @Override
    public String toString() {
        return "Muskrat{}";
    }

}
