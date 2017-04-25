package ch18.ex30.coded;

import ch18.ex30.coded.shapes.CircleS;
import ch18.ex30.coded.shapes.LineS;
import ch18.ex30.coded.shapes.Shapes;
import ch18.ex30.coded.shapes.SquareS;

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
        String fileOut = "./src/ch18/ex30/coded/state.dat";
        try {
            System.out.println("\nStore CAD System:");
            List<Class<? extends Shapes>> shapeTypes = new ArrayList<>();

            shapeTypes.add(CircleS.class);
            shapeTypes.add(SquareS.class);
            shapeTypes.add(LineS.class);

            List<Shapes> shapes = new ArrayList<>();

            for (int i = 0; i < 10 ; i++) {
                shapes.add(Shapes.randomFactory()); // добавить 10 объектов
            }
            for (int i = 0; i < 10 ; i++) {
                shapes.get(i).setColor(Shapes.GREEN); // задать всем объектам цвет зеленый
            }

            ObjectOutputStream sOut = new ObjectOutputStream(new FileOutputStream(fileOut));
            sOut.writeObject(shapeTypes);       // сохранить типы
            LineS.serializeStaticState(sOut);   // вызвать метод сохранения Line типа класс
            sOut.writeObject(shapes);           // весь список сохранить на диск


            System.out.println(shapes);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
