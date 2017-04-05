package ch18.ex01.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app(String[] args) {
        System.out.println("\n====LOCAL===");
        System.out.println("\nClass File Check\n");


//      String regex = "(\\w+\\W+)+zip";  // выбранные
        String regex = ".+";              // все файлы

        System.out.println("Dir with External Class:");
        System.out.println("------------------------");
        DirList.getDir(new String[]{regex}); // вместо args[]
        System.out.println("\nDir with Internal Class:");
        System.out.println("------------------------");

        DirList2.getDir(new String[]{regex}); // вместо args[]

        System.out.println("\nDir with Method Internal Class:");
        System.out.println("------------------------");
        DirList3.getDir(new String[]{regex}); // вместо args[]
    }
}
