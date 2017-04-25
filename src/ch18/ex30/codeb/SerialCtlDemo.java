package ch18.ex30.codeb;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class SerialCtlDemo {
    public static void check() {

        try {
            SerialCtl sc = new SerialCtl("Test1", "Test2");
            SerialCtlDefault scd = new SerialCtlDefault("Test3", "Test4");

            System.out.println("Before saving:");
            System.out.println("sc:");
            System.out.println(sc);
            System.out.println("scd:");
            System.out.println(scd);

            System.out.println("\nSaving objects");
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();
            ObjectOutputStream sOut = new ObjectOutputStream(bOut);
            sOut.writeObject(sc);
            sOut.writeObject(scd);

            System.out.println("\nReading objects");
            ObjectInputStream sIn = new ObjectInputStream(new ByteArrayInputStream(bOut.toByteArray()));
            SerialCtl sc2 = (SerialCtl)sIn.readObject();
            SerialCtlDefault scd2 = (SerialCtlDefault)sIn.readObject();

            System.out.println("\nAfter recovering:");
            System.out.println("sc2:");
            System.out.println(sc2);
            System.out.println("scd2:");
            System.out.println(scd2);

            sOut.close();
            sIn.close();
            bOut.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
