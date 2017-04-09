package ch18.ex02.access;

import ch18.ex02.access.office.SortedDirListOffice;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 2 Sorted Dir Check\n");
        SortedDirList sdList = new SortedDirList("./src/ch18");

        System.out.println("Listing:");
        for (String s : sdList.list()) {
            System.out.println(s);
        }

        System.out.println("\nListing with regex:");
        for (String s : sdList.list(".+ex02.ac.+")) {
            System.out.println(s);
        }
        System.out.println("\nOfficial solution:");
        String[]args = new String[] {"./src/ch18/ex02/exercise",".*Li.*"};
        System.out.println("parameters: ");
        System.out.println("          : args[0]="+args[0]);
        System.out.println("          : args[1]="+args[1]);


        SortedDirListOffice sDir = new SortedDirListOffice(args[0]);
        System.out.println(Arrays.toString(sDir.list(args[1])));



    }
}
