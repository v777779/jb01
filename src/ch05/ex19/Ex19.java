package ch05.ex19;


import java.util.Random;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Ex19 {
    public static void main(String[] args) {
        Random rnd  = new Random();

        System.out.println("\nObject Array with different arguments\n");

        Msg.printObj();
        Msg.printObj(1, 2, 3, 4);
        Msg.printObj(1, "str", 2.71, 35.43, 'c' + (short) 4);
        Msg.printObj(new Integer(15), new Float(2.54), new String("SetData ") + new Character('\uF0FF'));

        System.out.println("\nObject Uniform Array  Check\n");
        Msg.printObj((Object)ArrayUtils.toObject("Character Array "));
//      Msg.printObj(ArrayUtils.toObject(new String("Character Array ").toCharArray()));
        Msg.printObj((Object)ArrayUtils.toObject(Range.rangeInt(25)));

        System.out.println("\nString Array with skipped arguments\n");

        Msg.printStr(1, "-k");
        Msg.printStr(2, "-k", "-m");
        Msg.printStr(3, "-k", "-m", "-f");
        Msg.printStr(0);

        System.out.println("\nCharacter Array Check");
//        Character[] chObj = ArrayUtils.toObject("ArrayUtils.toObject ");
//        Msg.printChr(chObj);
        Msg.printChr(ArrayUtils.toObject("ArrayUtils.toObject "));

        System.out.println("\nInteger Array Check");

//        int [] ints = Range.rangeInt(25);                          // получить массив int[]
//        Integer[] intObj = ArrayUtils.toObject(ints);              // получить массив Integer[]
//        Msg.printInt( intObj);                                     // вывести через функцию func(Integer...)
        Msg.printInt(ArrayUtils.toObject(Range.rangeInt(25)));     // через массив Integer[]
        Msg.printInt(1,2,3,4,5,6);                              // через массив int [] автоупаковка

        Msg.printInt(ArrayUtils.toObject(Range.rangeFloat(25)));     // через массив Integer[]

//      Msg.printInt(();  // не работает т.к. есть две int Integer и Float

        System.out.println(new int[0].getClass());

        System.out.println("\nExercise  19 String Check \n");

        Msg.printStr(Range.rangeStr((rnd.nextInt(9)+1))); // сгенерить 25 строк



    }
}
