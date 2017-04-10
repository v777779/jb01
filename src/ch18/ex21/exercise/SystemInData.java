package ch18.ex21.exercise;

import java.io.*;

/**
 * Created by V1 on 10-Apr-17.
 */
public class SystemInData {
    public static void check(InputStream in, OutputStream out) {

        try {
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(in));
            BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(out));
            String s;
            while ((s = stdIn.readLine()) != null) {
                if (s.equals("stop")) {
                    break;
                }
                stdOut.write(s.toUpperCase()+"\n");
                stdOut.flush();
            }
            stdIn.close();
            stdOut.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
