package ch.ex8;

/**
 * Created by V1 on 04-Feb-17.
 */
public class Ex8 {
    public static void main(String[] args) {
        System.out.println("\nSpeedup calculation\n");
        ShortCircuit circuit = new ShortCircuit();
        boolean cmp = circuit.test1(0)&& circuit.test2(2)&&circuit.test3(2);

        System.out.println("calculation result: "+cmp);  // остановится на шаге 2 т.к. 2 < 2 = false и cmp = false
                                                        // независимо от значения шага 3 все сравнения по && И
// результаты вывода на печать
//        Speedup calculation
//
//        test1(0)> result: true
//        test2(2)> result: false
//        calculation result: false

        System.out.println("\nLiterals\n");
        int i1 = 0x2f; // HEX
        System.out.println("i1: "+Integer.toHexString(i1));
        int i2 = 0x2F; // HEX
        System.out.println("i2: "+Integer.toHexString(i2));
        int i3 = 0177; // OCTAL
        System.out.println("i3: "+Integer.toHexString(i3));
        char c = 0xF0FF; // два байта точно
         System.out.println();
        System.out.println("с : "+Integer.toHexString(c)+" as char "+c);
        short s = 0x7FFF;
        System.out.println("s : "+Integer.toHexString(s));
        long n1 = 200L;
        System.out.println("n1 : "+Long.toHexString(n1));

        float f1 = 200.0F;
        System.out.println("f1 : "+Float.toHexString(f1)+" to int bits "+Float.floatToIntBits(f1)+
                           " to string "+Float.toString(f1));
        double d1 = 200.0;  // double
        double d2 = 200.0D;
        System.out.println("d1 : "+Double.toHexString(d1)+" to int bits "+Double.doubleToLongBits(d1)+
                " to string "+Double.toString(d1));
        System.out.println("d2 : "+Double.toHexString(d2)+" to int bits "+Double.doubleToLongBits(d2)+
                " to string "+Double.toString(d2));

        System.out.println("\n\n Exercise\n");
        long n2 = 0xC8L;  //200
        long n3 = 0310L;  // 200
        System.out.println("n2 : "+Long.toString(n2));
        System.out.println("n2 : "+Long.toBinaryString(n2));
        System.out.println("n3 : "+Long.toString(n3));
        System.out.println("n3 : "+Long.toBinaryString(n3));

        double d3 = 1.234e5;
        System.out.println("Exponential number 1.234e5: "+ d3);

    }
}
