package ch08.ex03;

import ch08.ex03.local.GenRandom;
import ch08.ex03.local.Shape;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Ex3 {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        GenRandom genRandom = new GenRandom();

        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = genRandom.next();
        }

        for (Shape shape : shapes) {
            shape.draw();
            shape.show();
        }

    }




}
