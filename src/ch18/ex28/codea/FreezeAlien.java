package ch18.ex28.codea;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class FreezeAlien {
    public static void check() {
        String fileOut = "./src/ch18/ex28/codea/XFile.dat";

        try {
            ObjectOutput sOut = new ObjectOutputStream(new FileOutputStream(fileOut));
            Alien quiellek = new Alien();
            sOut.writeObject(quiellek);
            sOut.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
