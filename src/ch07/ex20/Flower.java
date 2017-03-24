package ch07.ex20;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Flower extends Plant {
 String s;
    public Flower(String s) {
        this.s = s;
        System.out.println("Flower.Flower()");

    }
//    @Override
//      void getGrow() {  // невозможно так как метод final
//
//      }
//    @Override    // показывает что нет переопределения
    void getOpen() {
        System.out.println("Flower.getOpen."+this);
    }

    @Override
    public String toString() {
        return "Flower."+s;
    }
}
