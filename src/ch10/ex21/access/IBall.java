package ch.ex21.access;

/**
 * Created by V1 on 16-Feb-17.
 */
public interface IBall {
    void playBall();
    void initBall();

    class BallColor {
        private String color;

        public BallColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }
    }

}
