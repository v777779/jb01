package ch18.ex22.codec;

/**
 * Created by V1 on 20-Feb-17.
 */
public class CodeC {
    public static void app() {
        System.out.println("\n====CODE_C===");
        System.out.println("\nProcess Control Check\n");

        System.out.println("javap file:");
        OSExecute.command("javap ./out/production/jb01/ch18/ex22/coord/CodeC");

        System.out.println("\njavap version:");
        OSExecute.command("javap -version");

    }
}
