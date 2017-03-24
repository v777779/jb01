package ch05.ex05;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Ex5 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.bark((char)1);
        dog.bark((short)1);
        dog.bark(1);
        dog.bark((long)1);

    }
}
