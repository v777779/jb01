package ch20.ex08.codec;

import lib.units.atunit.Test;
import lib.units.atunit.TestObjectCleanup;
import lib.units.atunit.TestObjectCreate;
import lib.units.atunit.TestProperty;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AtUnitExample5 {
    private String text;

    public AtUnitExample5(String text) {
        this.text = text;
    }

    @TestProperty
    public static PrintWriter output;

    @TestProperty
    public static int counter;

    @TestObjectCreate
    public static AtUnitExample5 create() {  // проверка другого имени
        String id = Integer.toString(counter++);
        try {
            output = new PrintWriter("src/ch20/ex08/codec/Test" + id + ".txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new AtUnitExample5(id);  // создается файл при создании каждого объекта
    }

    @TestObjectCleanup
    public static void cleanup(AtUnitExample5 obj) {
        System.out.println("Running cleanup "+ obj+ " ");  // obj действительно проинициализированный объект
        obj.output.close();
    }

    @TestProperty
    private int n = 15;

    @Test
    boolean test1() {
        output.print(text + ": test1 "+n++);
        return true;
    }

    @Test
    boolean test2() {
        output.print(this + ": test2 "+n++);
        return true;
    }

    @Test
    boolean test3() {
        output.print(text + ": test3 "+n++);
        return true;
    }

    @Override
    public String toString() {
        return text;
    }
}
