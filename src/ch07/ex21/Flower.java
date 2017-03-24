package ch07.ex21;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Flower extends Plant {
 String s;
    public Flower(String s) {
        this.s = s;
        System.out.println("Flower.Flower()");

    }

//      void getGrow() {  // невозможно так как метод final
//
//      }

    void getOpen() {  // новый метод Flower нет переопределения
        System.out.println("Flower.getOpen."+this);
    }

    void getSuperGetOpen() {
        System.out.print("Flower.getSuperGetOpen.");
        super.getToGetOpen();
    }

    @Override
    public String toString() {
        return "Flower."+s;
    }
}
