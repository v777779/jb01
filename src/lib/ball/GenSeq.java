package lib.ball;

import lib.utils.IGenerator;

/**
 * Created by V1 on 29-Mar-17.
 */
public class GenSeq implements IGenerator<Ball> {
    @Override
    public Ball next() {
        return new Ball();
    }
}
