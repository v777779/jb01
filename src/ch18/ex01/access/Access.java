package ch18.ex01.access;

import ch18.ex01.access.office.FileViewerOffice;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app(String args[]) {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 1 Check\n");


// read files inside catalog only
        if (args == null || args.length < 2) {
            args = new String[]{"./src/ch18/ex01/exercise","File.+","readLocal"};
        }

        System.out.println("Home version : search pattern args[0] : ");
        System.out.println("regex        : valid for codea dir only");
        System.out.println("pattern      : args[0] ");
        FileViewer.getDir(args);

        System.out.println("\nHome version2:");
        System.out.println("regex        : valid for codea dir only");
        System.out.println("pattern      : "+args[2]);
        FileViewerList.getDir(args);

        System.out.println("\nOfficial version:");
        String path = "./src/ch18/ex01/exercise";
        args = new String[] {"java","ORDER","FileViewerList"};
        System.out.println("parameters: ");
        System.out.println("          : path   ="+path);
        System.out.println("          : args[0]="+args[0]);
        System.out.println("          : args[1]="+args[1]);
        System.out.println("          : args[2]="+args[2]);
        System.out.println("Found files:");
        System.out.println("============");
        FileViewerOffice.getDir(path,args);

    }
}
