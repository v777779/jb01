package ch11.ex15.local;

import java.util.Random;

/**
 * Created by V1 on 21-Feb-17.
 */
public class Ball implements Comparable{
    private final String[] S_COLOR = new String[]{
            "brown",
            "black",
            "red",
            "blue",
            "yellow",
            "green",
            "magenta",
            "purple",
            "orange",
            "white"
    };
    private Random rnd = new Random();
    String color;

    public static Ball[] getBalls(Ball[] balls) {
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Ball();
        }
        return balls;
    }

    public static Ball next() {
        return new Ball();
    }


    public Ball() {
        this.color = S_COLOR[rnd.nextInt(10)];
    }

    @Override
    public String toString() {
        return "Ball." + color;
    }

    @Override
    public int compareTo(Object o) {
        return toString().compareTo(o.toString());
    }
}
