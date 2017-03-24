package ch08.ex2;

import ch08.ex2.local.GenRandom;
import ch08.ex2.local.Shape;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Ex2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        GenRandom genRandom = new GenRandom();

        System.out.println("\nPolymorphism Check \n");
        for (int i = 0; i <shapes.length ; i++) {
            shapes[i] = genRandom.next();  // генерируем объекты
        }

        for (Shape shape : shapes) {
            shape.draw();
//public             shape.erase();
        }

    }
}
