package ch05.ex6;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Ex6 {
    public static void main(String[] args) {
        char c1 = 0;
        short s1 = 0;
        int i1 = 0;
        long m1 = 0;

        Dog dog = new Dog();

        dog.bark(c1);
        dog.bark(s1);
        dog.bark(i1);
        dog.bark(m1);
        dog.bark(m1,i1);
        dog.bark(i1,m1);

    }
}
