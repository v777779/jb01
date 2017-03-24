package ch05.ex11;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Ex11 {
    public static void main(String[] args) {
        Level level = new Level();
        System.out.print("GC called >");
        System.gc();
        level = null;
        System.out.println("\n\nLink lost\n");
        System.out.print("GC called > ");
        System.gc();

    }
}
