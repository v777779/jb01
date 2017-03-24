package ch02.hw05;

/**
 * Created by V1 on 03-Feb-17.
 */
public class DataOnly {
    static boolean b;
    static int i;
    static double d;

    public static void main(String[] args) {  // так как метод статический все возможно изнутри класса
        System.out.println("boolean b:" + b + " int i:" + i + " double d:" + d);
        DataOnly.b = true;
        DataOnly.i = 12;
        DataOnly.d = 87.1;
        System.out.println("boolean b:" + b + " int i:" + i + " double d:" + d);
   }
}
