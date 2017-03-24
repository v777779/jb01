package ch.ex5;

/**
 * Created by V1 on 05-Feb-17.
 */
public class ConvTern {
    public  static String toBinaryString(int i) {
        int k = 0x80000000;
        String s = "";
        for (int j = 0; j < Integer.SIZE; j++) {
            s += ((i&k) == 0)?"0":"1";
            k>>>=1;
        }
        return s;
    }

}
