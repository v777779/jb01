package ch08.ex14;

import ch08.ex14.local.Composer;
import ch08.ex14.local.Shared;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Ex14 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("\nFinalize Reference Counting Check\n");
        Shared shared = new Shared();
        Composer[] composers = Composer.getComposer(shared);
        System.out.println("\nFinalize Check \n");
        for (Composer composer : composers) {
            composer.dispose();
        }
        System.out.println("\nComposer Finalize Done \n");

        System.out.println("c.create");

        Composer c = new Composer(new Shared());
        System.out.println("d.create");
        Composer d = new Composer(new Shared());
        System.out.println("c.dispose");
        c.dispose();
        c = null;
        d = null;
        System.out.println("\nGC.Start \n");


        System.gc();
        Thread.sleep(100);


    }
}
