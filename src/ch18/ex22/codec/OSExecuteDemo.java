package ch18.ex22.codec;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class OSExecuteDemo {
    public static void check() {

        System.out.println("javap file:");
        OSExecute.command("javap ./out/production/jb01/ch18/ex22/codec/OSExecuteDemo");

        System.out.println("\njavap version:");
        OSExecute.command("javap -version");

    }
}
