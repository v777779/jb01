package ch18.ex01.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise Check\n");

        System.out.println("Home version:");
        FileViewer.getDir(new String[]{""});
        System.out.println("\nOfficial version:");
        FileViewerOffice.getDir(new String[]{""});

    }
}
