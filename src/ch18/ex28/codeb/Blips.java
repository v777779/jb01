package ch18.ex28.codeb;

import java.io.*;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class Blips {
    public static void check() {
        String fileOut = "./src/ch18/ex28/codeb/blips.dat";

        try {

            Blip1 b1 = new Blip1();
            Blip2 b2 = new Blip2();
            ObjectOutputStream sOut = new ObjectOutputStream(new FileOutputStream(fileOut));
            System.out.println("\nSaving objects:");
            sOut.writeObject(b1);
            sOut.writeObject(b2);
            sOut.close();

            ObjectInputStream sIn = new ObjectInputStream(new FileInputStream(fileOut));
            System.out.println("\nRecovering objects:");
            System.out.println("\nRecovering b1:");
            b1 = (Blip1)sIn.readObject();
            System.out.println("\nRecovering b2:");   // НЕ РАБОТАЕТ если нет public  конструктора
            b2 = (Blip2)sIn.readObject();
            sIn.close();

            System.out.println("\nBlip3 class with parameters:");
            Blip3 b3 = new Blip3(12, "CheckBlip3");

            System.out.println("Blip3 original:"+b3);

            sOut = new ObjectOutputStream(new FileOutputStream(fileOut));
            System.out.println("\nSaving object:");
            sOut.writeObject(b3);
            sOut.close();

            sIn = new ObjectInputStream(new FileInputStream(fileOut));
            System.out.println("\nRecovering object:");
            b3 = (Blip3)sIn.readObject();
            sIn.close();

            System.out.println("Blip3 recovered:"+b3);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
