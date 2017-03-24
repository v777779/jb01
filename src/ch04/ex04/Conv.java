package ch04.ex04;

/**
 * Created by V1 on 04-Feb-17.
 */
public class Conv {
    public  static String toBinaryString(int i) {
        String s =  String.format("%032d",0)+Integer.toBinaryString(i);
        return s.substring(s.length()-Integer.SIZE,s.length());
    }

    public static String toBinaryString(long i) {
        String s =  String.format("%064d",0)+Long.toBinaryString(i);
        return s.substring(s.length()-Long.SIZE,s.length());
    }

    public static String toBinaryString(short i) {
        return (String.format("%016d",i));
    }

    public static String toBinaryString(char i) {
        return ((Integer.toBinaryString(0x10000+i)).substring(1)) ;
    }

}
