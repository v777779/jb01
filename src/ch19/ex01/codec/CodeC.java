package ch19.ex01.codec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class CodeC {
    public static void app() {
        System.out.println("\n====CODE_C===");
        System.out.println("\nENUM Parameters Check\n");
        for (OzWitch ozWitch : OzWitch.values()) {
            System.out.println(ozWitch+":"+ozWitch.getDescription());
        }
        System.out.println("\nStandard toString():");
        for (OzWitch ozWitch : OzWitch.values()) {
            System.out.println(ozWitch);
        }

        System.out.println("\nCustom toString():");
        for (OzWitchL ozWitch : OzWitchL.values()) {
            System.out.println(ozWitch);
        }
        System.out.println("\nCustom toString():");
        for (SpaceShip ship : SpaceShip.values()) {
            System.out.println(ship);
        }

    }
}
