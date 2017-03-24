package ch14.ex20.access.shop;

/**
 * Created by V1 on 08-Mar-17.
 */
public class Toy {
    public static int count = 1;
    public int i;
    public Toy() {
    }
    public Toy(int i) {
        this.i= i;
    }


    static {
//            System.out.println("Load: Toy");
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()+"."+i;
    }


}
