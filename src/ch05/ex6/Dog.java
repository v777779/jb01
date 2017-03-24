package ch05.ex6;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Dog {

    void bark(int i) {
        System.out.println("bark Int  > ");
    }

    void bark(short s) {
        System.out.println("bark Short  > ");
    }

    void bark(char c) {
        System.out.println("bark Char  > ");
    }

    void bark(long m) {
        System.out.println("bark Long  > ");
    }

    void bark(long m, int k) {
        System.out.println("bark Long Int > ");
    }

    void bark(int k, long m) {
        System.out.println("bark Int Long > ");
    }

}
