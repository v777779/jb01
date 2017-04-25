package ch18.ex23.codeb;

import lib.utils.TextFile;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 10-Apr-17.
 */
public class CodeB {
    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\nFileChannel Copy Check\n");

        System.out.println("FileChannel manual copy:");
        String fileIn = "./src/ch18/ex23/codeb/DataIn.txt";
        String fileOut = "./src/ch18/ex23/codeb/DataOut.txt";
        ChannelCopy.check(fileIn,fileOut);
        System.out.println("File Source:");
        System.out.print(TextFile.read(fileIn));
        System.out.println("\nFile Dest:");
        System.out.print(TextFile.read(fileOut));

        System.out.println("FileChannel transfer copy:");
        fileIn = "./src/ch18/ex23/codeb/Data2In.txt";
        fileOut = "./src/ch18/ex23/codeb/Data2Out.txt";
        TransferTo.check(fileIn,fileOut);

        System.out.println("File Source:");
        System.out.print(TextFile.read(fileIn));
        System.out.println("\nFile Dest:");
        System.out.print(TextFile.read(fileOut));

    }
}
