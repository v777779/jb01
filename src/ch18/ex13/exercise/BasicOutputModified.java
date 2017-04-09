package ch18.ex13.exercise;

import lib.files.BufferedInputFile;

import java.io.*;

/**
 * Created by V1 on 09-Apr-17.
 */
public class BasicOutputModified {
    public static void check(String fileName, String fileName2) {
        try {
            BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(fileName)));
            FileWriter fw = new FileWriter(fileName2);
            BufferedWriter bw = new BufferedWriter(fw); // буферизованный вывод
            PrintWriter pw = new PrintWriter  (bw);  // параметр буферизованный вывод

            LineNumberReader lin = new LineNumberReader(in);
            String s;
            while ( (s = lin.readLine()) != null) {
                pw.println(lin.getLineNumber() + ":" + s);
            }
            in.close();
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
