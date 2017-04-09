package ch18.ex12.codec;

import lib.files.BufferedInputFile;

import java.io.*;

/**
 * Created by V1 on 09-Apr-17.
 */
public class BasicOutput {
    public static void check(String fileName, String fileName2, String fileName3) {
        try {
            BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(fileName)));
            FileWriter fw = new FileWriter(fileName2);
            BufferedWriter bw = new BufferedWriter(fw); // буферизованный вывод
            PrintWriter pw = new PrintWriter  (bw);  // параметр буферизованный вывод
            PrintWriter pf = new PrintWriter  (fileName3);  // параметр имя файла

            int lineCount = 1;
            int lineCount2 = 1;
            String s;

            while ( (s = in.readLine()) != null) {
                pw.println(lineCount++ + ":" + s);
                pf.print(lineCount2++ + "." + s+"\n");
            }
            in.close();
            pw.close();
            pf.close();

            System.out.println("\nWritten files:");
            System.out.println("-----------------------------------");
            System.out.println(BufferedInputFile.read(fileName2));
            System.out.println("-----------------------------------");
            System.out.println(BufferedInputFile.read(fileName3));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
