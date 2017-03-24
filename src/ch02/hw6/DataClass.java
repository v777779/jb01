package ch02.hw6;

/**
 * Created by V1 on 03-Feb-17.
 */
public class DataClass {
    boolean b;
    int i;
    double d;

    int storage(String s) {
        return (s.length()*2);
    }


    void show(String s) {
        System.out.println(s +storage(s));
    }
}
