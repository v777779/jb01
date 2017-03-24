package ch07.ex11;

import ch07.ex11.local.Detergent;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Ex11 {
    public static void main(String[] args) {
        System.out.println("Delegated Methods Check");
        SpaceShip spaceShip = new SpaceShip("NASA Protector");
        spaceShip.moveForward(100);
        spaceShip.moveLeft(100);
        spaceShip.moveRight(100);
        spaceShip.turboBoost(100);

        System.out.println("spaceShip = " + spaceShip);


        System.out.println("\nExercise 11  Delegated Check\n");
        Detergent detergent = new Detergent();
        detergent.check();

    }
}
