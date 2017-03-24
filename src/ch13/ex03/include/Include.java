package ch13.ex03.include;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nString Format Check\n");
        int x = 5;
        double y = 5.332542;
        System.out.println("Row 1:["+x+" "+y+"]");
        System.out.format("Row 1:[%d %f]\n",x,y);
        System.out.printf("Row 1:[%d %f]\n",x,y);
    }
}
