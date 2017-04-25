package ch19.ex02.exercise;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class EnumImplementation {
    private static <T> void printNext(CartoonCharacter gen) {
        System.out.print(gen.next()+", ");
    }

    public static void check() {
        for (int i = 0; i < 10; i++) {
            printNext(CartoonCharacter.next2());
        }
        System.out.println();
    }

}
