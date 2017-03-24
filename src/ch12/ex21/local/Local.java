package ch12.ex21.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app(){
        System.out.println("\n====LOCAL===");
        System.out.println("\nConstructor Exception Check\n");
        try {
            System.out.println("Open File");
            InputFile f = new InputFile("src/ch12.ex21/local/InputFile.java");
            System.out.println("File opened:" + f.getName());

            for (int i = 0; i < 5; i++) {
                System.out.println(i + ":" + f.getLine());
            }

            f.dispose();

        } catch (Exception e) {   // простой перехват
            e.printStackTrace();
        }

    }
}
