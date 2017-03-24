package ch07.ex07;

/**
 * Created by V1 on 07-Feb-17.
 */
public class ClassA {
    int i;
    public ClassA() {
        System.out.println("ClassA Constructor parent class");
    }

    public ClassA(int i) {
        System.out.println("ClassA Constructor with Integer parent class");
        this.i = i;
    }
}
