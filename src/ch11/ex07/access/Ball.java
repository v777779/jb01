package ch11.ex07.access;

import java.util.Random;

/**
 * Created by V1 on 21-Feb-17.
 */
public class Ball {
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
    public Ball() {
        this.color = S_COLOR[rnd.nextInt(10)];
    }

    @Override
    public String toString() {
        return "Ball." + color;
    }
}
