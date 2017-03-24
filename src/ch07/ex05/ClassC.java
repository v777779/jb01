package ch07.ex05;

/**
 * Created by V1 on 07-Feb-17.
 */
public class ClassC extends ClassA {
    ClassB classB = new ClassB();
    int i;

    public ClassC(int i) {
        super(i); // обязательно в первой строке
        System.out.println("ClassC Constructor with Integer");
        this.i = i;
    }

    public ClassC() {
//        super(1); ; // обязательно в первой строке
        System.out.println("ClassC Constructor");
    }
}
