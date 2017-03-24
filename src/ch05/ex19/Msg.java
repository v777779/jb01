package ch05.ex19;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Msg {

    static void printObj(Object... iArray) {   // список аргументов любой длины любого типа
        for (Object o : iArray) {
            System.out.print( o + " ");
        }
        System.out.println();
    }

    static void printStr(int i, String... iStr) {   // список аргументов любой длины любого типа
        System.out.print("arguments : "+i+" ");
        for (String s : iStr) {
            System.out.print( s + " ");
        }
        System.out.println();
    }

    static void printStr(String... iStr) {   // список аргументов любой длины любого типа
        System.out.print( iStr.getClass()+ " length: "+iStr.length+" > ");
        for (String s : iStr) {
            System.out.print( s+" ");
        }
        System.out.println();
    }

    static void printChr(Character... iChr) {   // список аргументов любой длины любого типа
        System.out.print(   iChr.getClass()+" length: "+iChr.length+" > ");
        for (Character c : iChr) {
            System.out.print( c.toString() + " ");
        }
        System.out.println();
    }

    static void printInt(Integer... iInt) {   // список аргументов любой длины любого типа
        System.out.print(   iInt.getClass()+" length: "+iInt.length+" > ");
        for (Integer i : iInt) {
            System.out.print( String.valueOf(i) + " ");
        }
        System.out.println();
    }

    static void printInt(Float... iInt) {   // список аргументов любой длины любого типа
        System.out.print(   iInt.getClass()+" length: "+iInt.length+" > ");
        for (Float i : iInt) {
            System.out.printf( "%2.1f ",i );
        }
        System.out.println();
    }


}
