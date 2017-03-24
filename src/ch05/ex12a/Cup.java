package ch05.ex12a;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Cup {
    int i = 1;
    public Cup(int i) {
        System.out.println("Cup("+i+")");
    }
    void fCup(int i) {
        System.out.println("fCup > "+i);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("removed object Cup > "+this);
        super.finalize();
    }
}
