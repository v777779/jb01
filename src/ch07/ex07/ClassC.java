package ch07.ex07;

/**
 * Created by V1 on 07-Feb-17.
 */
public class ClassC extends ClassA {
    ClassB classB = new ClassB();

    public ClassC() {
        super(1); ; // обязательно в первой строке
        System.out.println("ClassC Constructor with Integer");

    }
}
