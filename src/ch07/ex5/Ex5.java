package ch07.ex5;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Ex5 {
    public static void main(String[] args) {
        System.out.println("\nClass C Current Class\n");
        ClassC classC = new ClassC();

        System.out.println("\nClass D Current Class\n");
        ClassD classD = new ClassD();

        System.out.println("\nClass C Current Class\n");
        ClassC classC2 = new ClassC(2);

    }
}
