package ch18.ex30.exercise;

import ch18.ex30.exercise.shapes.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class StoreCADState {
    public static void main(String[] args) {
        check();
    }
    public static void check() {
        String fileOut = "./src/ch18/ex30/exercise/state.dat";
        try {
            System.out.println("\nStore CAD System:");

            List<Shapes> shapes = new ArrayList<>();
            for (int i = 0; i < 10 ; i++) {
                shapes.add(Shapes.randomFactory()); // добавить 10 объектов
            }
            for (int i = 0; i < 10 ; i++) {
                shapes.get(i).setColor(Shapes.GREEN); // задать всем объектам цвет зеленый
            }
//            shapes.get(0).setColor(Shapes.RED);
//            shapes.get(1).setColor(Shapes.BLUE);


            ObjectOutputStream sOut = new ObjectOutputStream(new FileOutputStream(fileOut));
//store static
            CircleS.serializeStaticState(sOut);   // вызвать метод сохранения Line типа класс
            SquareS.serializeStaticState(sOut);   // вызвать метод сохранения Line типа класс
            LineS.serializeStaticState(sOut);   // вызвать метод сохранения Line типа класс
            sOut.writeObject(shapes);           // весь список сохранить на диск

            System.out.println(shapes);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
