package ch18.ex02.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 2 Sorted Dir Check\n");
        SortedDirList sdList = new SortedDirList("./src/ch18");
        //FileList.getDir(new String[]{"./src/ch18"});
        System.out.println("Listing:");
        for (String s : sdList.list()) {
            System.out.println(s);
        }

        System.out.println("\nListing with regex:");
        for (String s : sdList.list(".+ex02.ac.+")) {
            System.out.println(s);
        }


    }
}
