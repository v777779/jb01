package ch15.ex28.remote;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Remote {
    public static void app() {
        System.out.println("\n====REMOTE===");
        System.out.println("\nBounds Wilcard Check\n");
        GenericWriting gw = new GenericWriting();
        gw.app();
        GenericReading gr = new GenericReading(gw.listApple,gw.ListFruit);
        gr.app();


    }
}
