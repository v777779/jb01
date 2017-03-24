package ch02.ex02;

import java.io.Serializable;

/**
 * Created by V1 on 02-Feb-17.
 */
public class Shape implements Serializable {
    int x;
    int y;

    void draw() {
        System.out.println("Draw Shape");
    }

    @Override
    public String toString() {
        String s = "This is Shape";
        return s;
    }
}
