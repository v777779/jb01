package ch.ex11.access;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Sport {
    private class Ball implements IBall {
        @Override
        public void play() {
            System.out.println("Ball.play");
        }

        @Override
        public void jump() {
            System.out.println("Ball.jump");
        }
    }

    public IBall getBall() {
        return new Ball();
    }

}
