package ch18.ex28.exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
class Blips {
    public static void check() {
        String fileOut = "./src/ch18/ex28/exercise/blips.dat";

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


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
