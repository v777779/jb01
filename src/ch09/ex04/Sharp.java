package ch09.ex04;

/**
 * Created by V1 on 11-Feb-17.
 */
public class Sharp extends Tool {
    @Override
    void getBase2(Stone stone) {
        System.out.println("Sharp.getBase2 > "+stone);
    }

    @Override
    public String toString() {
        return "Sharp{}";
    }
}
