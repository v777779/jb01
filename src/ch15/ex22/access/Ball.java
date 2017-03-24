package ch.ex22.access;

/**
 * Created by V1 on 17.03.2017.
 */
public class Ball {
    private String color;
    private int size;

    public Ball(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public Ball() {
        this.color = "Yellow";
        this.size = 15;
    }

    public Ball(String s) {
        this.color = s;
    }

    public Ball(int i, String s) {
        this.color = s;
        this.size = i;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
