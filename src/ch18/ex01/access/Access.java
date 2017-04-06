package ch18.ex01.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app(String args[]) {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 1 Check\n");


// read files inside catalog only
        if (args == null || args.length < 2) {
            args = new String[]{"./src/ch18/ex01/access","File.+","readLocal"};
        }

        System.out.println("Home version : search pattern args[0] : ");
        System.out.println("regex        : valid for local dir only");
        System.out.println("pattern      : args[0] ");
        FileViewer.getDir(args);

        System.out.println("\nHome version2:");
        System.out.println("regex        : valid for local dir only");
        System.out.println("pattern      : "+args[2]);
        FileViewerList.getDir(args);

        System.out.println("\nOfficial version:");
        System.out.println("regex        : valid for local dir only");
        System.out.println("pattern      : "+args[2]);

        FileViewerOffice.getDir(args);

    }
}
