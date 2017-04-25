package ch18.ex27.codec;

import java.io.*;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class Serialize {
    public static void check() {
        String fileOut = "./src/ch18/ex27/codec/worm.dat";
        new File(fileOut).delete();

        try {

            WormS wormS = new WormS(6, 'a');  // червяк длиною в 6 звеньев
            System.out.println("wormS:" + wormS);
//write
            System.out.println("\nSerialize object and write to disk:");
            ObjectOutputStream sOut = new ObjectOutputStream(new FileOutputStream(fileOut)); // пишем в файл worm.dat
            sOut.writeObject("Worm storage to File");
            sOut.writeObject(wormS);  // записать всю цепочку объектов
            sOut.close();
//read
            System.out.println("\nRead object from disk and Serialize:");
            ObjectInputStream sIn = new ObjectInputStream(new FileInputStream(fileOut));
            String s = (String) sIn.readObject();
            WormS wormS2 = (WormS) sIn.readObject(); // нисходящее преобразование
            System.out.println(s);
            System.out.println("wormS2:" + wormS2);
//write
            System.out.println("\nSerialize object and write to ArrayByteStream:");
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();
            ObjectOutputStream sOut2 = new ObjectOutputStream(bOut); // пишем в поток byte[]
            sOut2.writeObject("Worm storage to byte[]");
            sOut2.writeObject(wormS);   // оригинал
            sOut2.writeObject(wormS2);  // копию
            sOut2.flush();              // выгрузили все данные в byte[]
//read
            System.out.println("\nRead object from ArrayByteStream and Serialize:");
            ObjectInputStream sIn2 = new ObjectInputStream(new ByteArrayInputStream(bOut.toByteArray()));
            s = (String) sIn2.readObject();
            WormS wormS3 = (WormS) sIn2.readObject(); // нисходящее преобразование
            WormS wormS4 = (WormS) sIn2.readObject(); // нисходящее преобразование
            System.out.println(s);
            System.out.println("wormS3:" + wormS3);
            System.out.println("wormS4:" + wormS4);

            sOut2.close();
            bOut.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
