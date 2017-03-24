package ch06.ex08.access;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Launch {
    Ball ball;
    Disk disk;

    public void getBallInfo() {
        System.out.println("ball = " + ball.s+" accessed "+ball.i++ + " times");
    }

    public void getDiskShow() {
        disk.show(); // через
    }

    public Launch() {
        ball = Ball.mkeBall("1");
        disk = Disk.access();; // заполняем singletone
    }
}
