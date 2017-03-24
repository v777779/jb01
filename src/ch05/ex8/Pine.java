package ch05.ex8;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Pine {
    void grow() {
        leaf();
        this.leaf();
    }

    void leaf() {
        System.out.println("Grow Leaf");
    }
}
