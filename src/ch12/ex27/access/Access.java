package ch12.ex27.access;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise   Check\n");

        int[] ints = new int[]{0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(ints));

        try {
            try {
                ints[12] = 12;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("catch:  original:"+e.getClass().getSimpleName());
                throw new RuntimeException(e); // отправляем наверх в упаковке
            }
            System.out.println(Arrays.toString(ints));
        } catch (RuntimeException rt) {     // поймали наверху
            try {
                throw rt.getCause();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("catch:   runtime:"+e.getClass().getSimpleName());
            } catch (Throwable e) {
                System.out.println("catch: throwable:"+e.getClass().getSimpleName());

            }
        }
    }
}
