package ch06.ex7.lib;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Call extends Plate {
    Ball ball = new Ball();

    public int i = 1;
    String s = "Call extends Plate";

    public void showAll() {
            show();
            ball.show();
            super.show();
    }

    void show () {
        System.out.println("s = " + s);
    }


}
