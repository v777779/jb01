package lib.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Vadim Voronov
 * Created: 17-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Serializer {
    public static void check() throws Exception {
        Ball b1 = new Ball();
        Ball b2 = new Ball();
        Ball b3 = new Ball();

        System.out.println(b1 + " " + b2 + " " + b3);
        String fileOut = "D:\\temp2\\fileBall.dat";

//write
        System.out.println("\nSerialize object and write to disk:");
        ObjectOutputStream sOut = new ObjectOutputStream(new FileOutputStream(fileOut)); // пишем в файл worm.dat
        sOut.writeObject("Ball storage to File"); // сначала строка
        Ball.serializeStaticState(sOut);
        sOut.writeObject(b1);  // записать всю цепочку объектов
        sOut.writeObject(b2);  // записать всю цепочку объектов
        sOut.writeObject(b3);  // записать всю цепочку объектов
        sOut.close();

        Ball.setSpeed();  // изменили
        System.out.println(b1 + " " + b2 + " " + b3);
//read
        System.out.println("\nRead object from disk and Serialize:");
        ObjectInputStream sIn = new ObjectInputStream(new FileInputStream(fileOut));
        String s = (String) sIn.readObject();
        Ball.deserializeStaticState(sIn);
        Ball b4 = (Ball) sIn.readObject(); // нисходящее преобразование
        Ball b5 = (Ball) sIn.readObject(); // нисходящее преобразование
        Ball b6 = (Ball) sIn.readObject(); // нисходящее преобразование
        System.out.println(s);


        System.out.println(b1 + " " + b2 + " " + b3);
        System.out.println(b4 + " " + b5 + " " + b6);
    }



    public static void main(String[] args) throws Exception {
        Ball b1 = new Ball();
        Ball b2 = new Ball();
        Ball b3 = new Ball();

        System.out.println(b1 + " " + b2 + " " + b3);
        String fileName = "D:\\temp2\\fileBall.dat";

//write
        System.out.println("\nSerialize object and write to disk:");
        Ball.serializer(new Ball[]{b1,b2,b3},fileName);

        Ball.setSpeed();  // изменили
        System.out.println(b1 + " " + b2 + " " + b3);
//read
        System.out.println("\nRead object from disk and Serialize:");
        Ball[] balls = Ball.deserializer(new Ball[3],fileName);

        System.out.println(b1 + " " + b2 + " " + b3);
        System.out.println(balls[0] + " " + balls[1] + " " + balls[2]);


    }
}
