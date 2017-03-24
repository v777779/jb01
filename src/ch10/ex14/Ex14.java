package ch10.ex14;

import ch10.ex14.access.*;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Ex14 {
    public static void main(String[] args) {
        System.out.println("\nExercise 14 Anonymous Class from Interface Check\n");
        IDangerousMonster barney = new IDangerousMonster() {
            @Override
            public void destroy() {
                System.out.println("Ex14.destroy");
            }

            @Override
            public void menace() {
                System.out.println("Ex14.menace");
            }
        };  // from class

        IVampire vent = new IVampire() {
            @Override
            public void drinkBlood() {
                System.out.println("Ex14.drinkBlood");
            }

            @Override
            public void destroy() {
                System.out.println("Ex14.destroy");
            }

            @Override
            public void kill() {
                System.out.println("Ex14.kill");
            }

            @Override
            public void menace() {
                System.out.println("Ex14.menace");
            }
        };

        HorrorShow.u(barney);
        HorrorShow.v(barney);
        HorrorShow.u(vent);
        HorrorShow.v(vent);
        HorrorShow.w(vent);
    }
}
