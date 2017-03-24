package ch05.ex19;

import java.util.Random;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Range {
static Random rnd = new Random();

    static int[] rangeInt (int i) {
        int[] ints = new int[i];
        for (int j = 0; j < ints.length; j++) {
            ints[j] = rnd.nextInt(50)+50;
        }
        return ints;
    }

    static float[] rangeFloat (int i) {
        float[] ints = new float[i];
        for (int j = 0; j < ints.length; j++) {
            ints[j] = rnd.nextFloat()*25;
        }
        return ints;
    }

    static String[] rangeStr(int i) {
      String [] s = new String[i];
        for (int j = 0; j < s.length; j++) {
            s[j] = "StrData "+ (j);
        }
        return s;
    }

}
