package ch18.ex06.local;

import java.io.File;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static String getPath(String s) {
        String path="./src";
        try {
            path = new File(s).getAbsolutePath();
        } catch (Exception e) {
            System.out.println("catch: IO Exception");
        }
        return path+"\\";
    }

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nMake Directory Check\n");

        String path = getPath("./src/ch18/ex06");
        System.out.println("Create catalogs:");
        CatalogMake.fileManage(new String[]{path + "Test.java", path + "Test2.java"});
        System.out.println("\nRename catalogs:");
        CatalogMake.fileManage(new String[]{"-r",path + "Test2.java", path + "Test3.java"});
        System.out.println("\nDelete catalogs:");
        CatalogMake.fileManage(new String[]{"-d", path + "Test.java",path+"Test2.java",path+"Test3.java"});


    }
}
