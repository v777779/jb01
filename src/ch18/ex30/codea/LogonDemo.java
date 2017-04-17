package ch18.ex30.codea;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class LogonDemo {
    public static void check() {
        String fileOut = "./src/ch18/ex30/codea/logon.dat";

        try {
            Logon logon = new Logon("Hulk", "myLittlePony");
            System.out.println("logon data:" + logon);
            System.out.println("\nSaving object :" + logon);
            ObjectOutputStream sOut = new ObjectOutputStream(new FileOutputStream(fileOut));
            sOut.writeObject(logon);
            sOut.close();
            Thread.sleep(1000); // 1 секунд задержки
            ObjectInputStream sIn = new ObjectInputStream( new FileInputStream(fileOut));
            System.out.println("\nRecovering object at:"+new Date());
            logon = (Logon)sIn.readObject();  // прочитали объект
            System.out.println("recovered object:"+logon);






        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
