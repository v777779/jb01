package ch.ex24;

import ch.ex24.access.ClassA2;
import ch.ex24.access.ClassB2;

import java.util.Random;

/**
 * Created by V1 on 16-Feb-17.
 */
public class Ex24 {
    public static void main(String[] args) {
        System.out.println("\nExercise 24 Inner Class Check\n");
        ClassA2[] a2Array = new ClassA2[10];
        for (int i = 0; i < a2Array.length; i++) {
            a2Array[i] = new ClassA2();
        }
        ClassB2 b2 = new ClassB2(a2Array.length); // один объект B
        for (int i = 0; i < a2Array.length ; i++) {
            b2.add(a2Array[i].getU()); // получить ссылку и отправить ее в b2
        }

        for (int i = 0; i < a2Array.length/2; i++) {
            Random rnd = new Random();
            b2.remove(rnd.nextInt(a2Array.length)); // сбросить половину ссылок
        }

        b2.show();


    }
}
