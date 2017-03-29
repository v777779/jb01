package lib.ball;

import lib.utils.IGenerator;

import java.util.Random;

/**
 * Created by V1 on 29-Mar-17.
 */
public class GenRnd implements IGenerator<Ball> {
    private Random rnd = new Random();
    private int range = 100;

    public GenRnd() {
    }

    public GenRnd(int range) {
        this.range = range;
    }

    @Override
    public Ball next() {
        return new Ball(rnd.nextInt(range));
    }
}
