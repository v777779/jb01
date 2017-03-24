package ch06.ex06;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Ball {
    Play play = new Play();

    public void setPlayInt(int i) {
        System.out.print("Ball setter > ");
        this.play.setI(i);
    }

    public int getPlayInt() {
        System.out.print("Ball getter > ");

        return play.getI();
    }

    public void show() {
        System.out.print("Ball show > ");
        play.getShow();
    }

}
