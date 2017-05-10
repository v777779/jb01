package lib.ball;

import lib.utils.IGenerator;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Ball implements Iterable<Ball>, IComparator<Ball>, IGenerator<Ball> {
    private final String[] COLORS = "green red yellow brown blue magenta black white".split(" ");
    private static long counter = 1;
    private final long id;
    private String color;
    private Random rnd = new Random();


    public BallSmall bs = new BallSmall();

    public Ball() {
        this.id = counter++;
        this.color = COLORS[rnd.nextInt(COLORS.length)];
    }

    public Ball(int id) {
        this.id = id;
        this.color = COLORS[rnd.nextInt(COLORS.length)];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;

        Ball ball = (Ball) o;

        if (id != ball.id) return false;
        return color != null ? color.equals(ball.color) : ball.color == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public int compare(Ball o1, Ball o2) {

        if (o1.getId() < o2.getId()) return -1;
        if (o1.getId() > o2.getId()) return 1;
        return 0;
    }

    @Override
    public Ball next() {
        return new Ball();
    }

    class BallSmall {
    }

    public long getId() {
        return id;
    }

    @Override
    public Iterator<Ball> iterator() {
        return new Iterator<Ball>() {
            int count = 10;

            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public Ball next() {
                count--;
                return (new Ball());
            }
        };
    }

    public static class Factory implements IGenerator<Ball> {
        @Override
        public Ball next() {
            return new Ball();
        }
    }

    @Override
    public String toString() {
        return "Ball(" + id + ")";
    }
}
