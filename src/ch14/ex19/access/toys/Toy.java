package ch14.ex19.access.toys;

/**
 * Created by V1 on 08-Mar-17.
 */
public class Toy {
    private static int count = 1;
    protected int i;
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