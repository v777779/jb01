package ch18.ex21.codea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by V1 on 10-Apr-17.
 */
public class SystemInEcho {
    public static void check() {
        try {

            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            String s;
            while ((s = stdIn.readLine()) != null) {
                System.out.println(s);
                if (s.equals("stop")) {
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
