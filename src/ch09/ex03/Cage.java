package ch09.ex03;

/**
 * Created by V1 on 11-Feb-17.
 */
public class Cage extends Zoo {
    String status = "Empty Cage";
    private int i = getValue(15);

    public Cage() {
        System.out.print("Cage.Constructor > ");
        print();
    }

    int getValue(int i) {
        System.out.println("int i initialyzer");
        return i;
    }

    String  getStatus() {
    return  status;
    }

    @Override
    void print() {
        System.out.println("int i = "+i);
    }

    @Override
    public String toString() {
        return "Cage{" +
                "status='" + status + '\'' +
                '}';
    }
}
