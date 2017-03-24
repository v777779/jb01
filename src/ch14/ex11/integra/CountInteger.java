package ch14.ex11.integra;

import java.util.Random;
/**
 * Created by V1 on 09-Mar-17.
 */
public class CountInteger {
    private static long counter;
    private final long id = counter++;
    private final char[] chs = "sfkdjfheruifeuiowf89ry9348rfhiadufhskcb".toCharArray();


    @Override
    public String toString() {
        Random rnd = new Random();
        return (""+chs[rnd.nextInt(chs.length)]+chs[rnd.nextInt(chs.length)]+chs[rnd.nextInt(chs.length)]);
    }

}
