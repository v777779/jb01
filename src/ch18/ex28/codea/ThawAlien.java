package ch18.ex28.codea;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class ThawAlien {
    public static void check() {
        String fileIn = "./src/ch18/ex28/codea/XFile.dat";
        try {
            ObjectInput sIn = new ObjectInputStream(new FileInputStream( fileIn));
            Object mystery = sIn.readObject();
            System.out.println(mystery.getClass());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
