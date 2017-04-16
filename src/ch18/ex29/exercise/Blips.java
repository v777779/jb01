package ch18.ex29.exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class Blips {
    public static void check() {
        String fileOut = "./src/ch18/ex29/exercise/blips.dat";

        try {

            System.out.println("Blip3 class with parameters:");
            Blip3 b3 = new Blip3(25, "Check_Name_Blip3");

            System.out.println("Blip3 original:"+b3);

            ObjectOutputStream sOut = new ObjectOutputStream(new FileOutputStream(fileOut));
            System.out.println("\nSaving object:");
            sOut.writeObject(b3);
            sOut.close();

            ObjectInputStream sIn = new ObjectInputStream(new FileInputStream(fileOut));
            System.out.println("\nRecovering object:");
            b3 = (Blip3)sIn.readObject();
            sIn.close();

            System.out.println("Blip3 recovered:"+b3);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
