package lib.serialize;

import java.io.*;
import java.util.Random;

/**
 * Vadim Voronov
 * Created: 17-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Ball implements Serializable {
    private int x;
    private int y;

    private static int xSpeed;
    private static int ySpeed;

    private static Random rnd = new Random();

    static {
        xSpeed = rnd.nextInt(10);
        ySpeed = rnd.nextInt(10);


    }

    public static void setSpeed() {
        xSpeed = rnd.nextInt(10);
        ySpeed = rnd.nextInt(10);
    }


    public static int getxSpeed() {
        return xSpeed;
    }

    public static int getySpeed() {
        return ySpeed;
    }

    public static void setxSpeed(int xSpeed) {
        Ball.xSpeed = xSpeed;
    }

    public static void setySpeed(int ySpeed) {
        Ball.ySpeed = ySpeed;
    }

    public Ball() {
        x = rnd.nextInt(90) + 10;
        y = rnd.nextInt(90) + 10;
    }

    public static void serializeStaticState(ObjectOutputStream stream) throws IOException {
        stream.writeInt(xSpeed);
        stream.writeInt(ySpeed);
    }

    public static void deserializeStaticState(ObjectInputStream stream) throws IOException {
        xSpeed = stream.readInt();
        ySpeed = stream.readInt();

    }

    public static void serializer(Ball ball, String fileOut) throws Exception {
        ObjectOutputStream sOut = new ObjectOutputStream(new FileOutputStream(fileOut)); // пишем в файл worm.dat
        Ball.serializeStaticState(sOut); // статику сохраняем
        sOut.writeObject(ball);
        sOut.close();
    }

    public static Ball deserializer(String fileIn) throws Exception {
        ObjectInputStream sIn = new ObjectInputStream(new FileInputStream(fileIn));
        Ball.deserializeStaticState(sIn);
        Ball ball = (Ball) sIn.readObject(); // нисходящее преобразование
        return ball;
    }

    public static void serializer(Ball[] balls, String fileOut) throws Exception {
        ObjectOutputStream sOut = new ObjectOutputStream(new FileOutputStream(fileOut)); // пишем в файл worm.dat
        Ball.serializeStaticState(sOut); // статику сохраняем
        for (int i = 0; i < balls.length; i++) {
            sOut.writeObject(balls[i]);
        }
        sOut.close();
    }

    public static Ball[] deserializer(Ball[] balls, String fileIn) throws Exception {
        ObjectInputStream sIn = new ObjectInputStream(new FileInputStream(fileIn));
        Ball.deserializeStaticState(sIn);
        for (int i = 0; i < balls.length; i++) {
            balls[i] = (Ball) sIn.readObject(); // нисходящее преобразование
        }
        return balls;
    }


    @Override
    public String toString() {
        return "Ball " + x + " " + y + " " + xSpeed + " " + ySpeed;
    }
}
