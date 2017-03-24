package ch07.ex22;

/**
 * Created by V1 on 09-Feb-17.
 */
final public class Air  {
    final int i = 12;
    int k = 5;

    public Air() {
        System.out.println("Air.Air");
    }

    @Override
    public String toString() {
        return "Air{" +
                "i=" + i +
                ", k=" + k +
                '}';
    }
}
