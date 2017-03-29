package lib.ball;

import lib.utils.IGenerator;

import java.util.Iterator;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Ball implements Iterable<Ball>, IComparator<Ball>, IGenerator<Ball> {
private static long counter = 1;
private final long id;
public BallSmall bs = new BallSmall();

    public Ball() {
        this.id =  counter++;
    }

    public Ball(int id) {
        this.id = id;
    }

    @Override
    public int compare(Ball o1, Ball o2) {

        if(o1.getId() < o2.getId()) return -1;
        if(o1.getId() > o2.getId()) return 1;
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

    @Override
    public String toString() {
        return "Ball("+id+")";
    }
}
