package ch18.ex30.coded;

import ch18.ex30.coded.shapes.LineS;
import ch18.ex30.coded.shapes.Shapes;

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
        String fileIn = "./src/ch18/ex30/coded/state.dat";
        try {
            System.out.println("\nRecover CAD System:");
            ObjectInputStream sIn = new ObjectInputStream(new FileInputStream(fileIn));
            List<Class<?extends Shapes>> shapeTypes = (List<Class<?extends Shapes>>)sIn.readObject();  // список классов
            LineS.deserializeStaticState(sIn);                      // вызвать метод восстановления Line
            List<Shapes> shapes = (List<Shapes>)sIn.readObject();   // список объектов классов
            System.out.println(shapes);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
