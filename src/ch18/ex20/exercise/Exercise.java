package ch18.ex20.exercise;

import lib.files.Catalog;
import lib.utils.BinaryFile;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 20 Directory and BinaryFile Check\n");
        String filePath = "./src";

        byte[] btemp  = new byte[]{(byte)0xCA,(byte)0xFE,(byte)0xBA,(byte)0xBE};
        List<File> list = Catalog.walk(filePath,".*.class").getListFiles();
        for (File file : list) {
            byte[] bytes = Arrays.copyOf(BinaryFile.read(file),4);
            System.out.printf("%-15s [CA CE BA BE]:%b\n",file.getName(),Arrays.equals(bytes, btemp));
        }


    }
}
