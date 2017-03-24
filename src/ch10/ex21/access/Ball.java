package ch10.ex21.access;

/**
 * Created by V1 on 16-Feb-17.
 */
public class Ball implements IBall {
    String name;
    BallColor bcolor;

    public Ball(String name) {
        this.name = name;
        bcolor = new BallColor("white");
    }

    public String getName() {
        return name;
    }

    @Override
    public void playBall() {
        System.out.println("Ball."+name+".Play");
    }

    @Override
    public void initBall() {
        System.out.println("Ball."+name+".Init");
    }

    @Override
    public String toString() {
        return "Ball{" +
                "name='" + name + '\'' +
                ", bcolor=" + bcolor.getColor() +
                '}';
    }
}
