package lib.ball;

import java.util.Iterator;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Ball implements Iterable<Ball> {
private static long counter = 1;
private final long id = counter++;
public BallSmall bs = new BallSmall();

    class BallSmall {
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

    @Override
    public String toString() {
        return "Ball("+id+")";
    }
}
