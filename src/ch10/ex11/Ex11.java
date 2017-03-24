package ch.ex11;

import ch.ex11.access.IBall;
import ch.ex11.access.Sport;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Ex11 {
    public static void main(String[] args) {
        System.out.println("\nPrivate Inner Class Check");
        Sport sp = new Sport();
        IBall ib = sp.getBall();
        ib.play();
        ib.jump();

    }
}
