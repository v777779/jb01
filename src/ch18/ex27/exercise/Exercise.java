package ch18.ex27.exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Feb-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 27 Serialize Check\n");
        String fileOut = "./src/ch18/ex27/codec/ser.dat";
        try {
            BlockS blockS = new BlockS();  // червяк длиною в 6 звеньев
            DeckS deckS = new DeckS();
            System.out.println("blockS :" + blockS);
            System.out.println("deckS  :" + deckS);
//write
            System.out.println("\nSerialize object:" + blockS);
            ObjectOutputStream sOut = new ObjectOutputStream(new FileOutputStream(fileOut)); // пишем в файл worm.dat
            sOut.writeObject(blockS);  // записать всю цепочку объектов
            sOut.close();

            System.out.println("New state of object:");
            blockS.setNext(deckS);
            System.out.println("blockS :" + blockS);

//read
            System.out.println("\nDeSerialize object:");
            ObjectInputStream sIn = new ObjectInputStream(new FileInputStream(fileOut));
            BlockS blockS2 = (BlockS) sIn.readObject(); // нисходящее преобразование
            System.out.println("blockS2:" + blockS2);

            System.out.println("Both objects:");
            System.out.println("blockS :" + blockS);
            System.out.println("blockS2:" + blockS2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
