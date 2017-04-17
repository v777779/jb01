package ch18.ex30.exercise;

import ch18.ex30.exercise.shapes.*;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class RestoreCadState {
    public static void main(String[] args) {
        check();
    }
    public static void check() {
        String fileIn = "./src/ch18/ex30/exercise/state.dat";
        try {
            System.out.println("\nRecover CAD System:");
            ObjectInputStream sIn = new ObjectInputStream(new FileInputStream(fileIn));
//restore static
            CircleS.deserializeStaticState(sIn);                      // вызвать метод восстановления Line
            SquareS.deserializeStaticState(sIn);                      // вызвать метод восстановления Line
            LineS.deserializeStaticState(sIn);                      // вызвать метод восстановления Line

            List<Shapes> shapes = (List<Shapes>)sIn.readObject();   // список объектов классов
            System.out.println(shapes);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
