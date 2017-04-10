package ch18.ex19.exercise;

import lib.files.BFileWrite;
import lib.utils.BinaryFile;
import lib.utils.TextFile;

import java.util.Map;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 19 BinaryFile and Map Check\n");

        String fileName = "./src/ch18/ex19/exercise/CodeA.txt";
        BFileWrite.writeString(fileName, TextFile.read("./src/ch18/ex19/codea/CodeA.java"));//"AAAABBBCCD");
        Map<Byte,Integer> map = ByteMap.count(BinaryFile.read(fileName));
        int lines = 1;
        System.out.println("byte[] Map as Byte:");
        ByteMap.showBytes(map);
        System.out.println("\nbyte[] Map as Char:");
        ByteMap.showChars(map);

    }
}
