package lib.serialize;

import java.io.*;

/**
 * Vadim Voronov
 * Created: 17-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BallSerialize {

    public static void serializeStaticState(ObjectOutputStream stream) throws IOException {
        stream.writeInt(Ball.getxSpeed());
        stream.writeInt(Ball.getySpeed());
    }

    public static void deserializeStaticState(ObjectInputStream stream) throws IOException {
        Ball.setxSpeed(stream.readInt());
        Ball.setySpeed(stream.readInt());

    }

    public static void serializer(Ball ball, String fileOut) throws Exception {
        ObjectOutputStream sOut = new ObjectOutputStream(new FileOutputStream(fileOut)); // пишем в файл worm.dat
        serializeStaticState(sOut); // статику сохраняем
        sOut.writeObject(ball);
        sOut.close();
    }

    public static Ball deserializer(String fileIn) throws Exception {
        ObjectInputStream sIn = new ObjectInputStream(new FileInputStream(fileIn));
        deserializeStaticState(sIn);
        Ball ball = (Ball) sIn.readObject(); // нисходящее преобразование
        return ball;
    }

    public static void serializer(Ball[] balls, String fileOut) throws Exception {
        ObjectOutputStream sOut = new ObjectOutputStream(new FileOutputStream(fileOut)); // пишем в файл worm.dat
        serializeStaticState(sOut); // статику сохраняем
        for (int i = 0; i < balls.length; i++) {
            sOut.writeObject(balls[i]);
        }
        sOut.close();
    }

    public static Ball[] deserializer(Ball[] balls, String fileIn) throws Exception {
        ObjectInputStream sIn = new ObjectInputStream(new FileInputStream(fileIn));
       deserializeStaticState(sIn);
        for (int i = 0; i < balls.length; i++) {
            balls[i] = (Ball) sIn.readObject(); // нисходящее преобразование
        }
        return balls;
    }

    public static void main(String[] args) throws Exception{
        Ball b1 = new Ball();
        Ball b2 = new Ball();
        Ball b3 = new Ball();

        System.out.println(b1 + " " + b2 + " " + b3);
        String fileName = "D:\\temp2\\fileBall.dat";

//write
        System.out.println("\nSerialize object and write to disk:");
        serializer(new Ball[]{b1,b2,b3},fileName);

        Ball.setSpeed();  // изменили
        System.out.println(b1 + " " + b2 + " " + b3);
//read
        System.out.println("\nRead object from disk and Serialize:");
        Ball[] balls = deserializer(new Ball[3],fileName);

        System.out.println(b1 + " " + b2 + " " + b3);
        System.out.println(balls[0] + " " + balls[1] + " " + balls[2]);

    }

}
