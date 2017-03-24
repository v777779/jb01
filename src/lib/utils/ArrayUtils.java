package lib.utils;

/**
 * Created by V1 on 06-Feb-17.
 */
public class ArrayUtils {
    public int i1;
    protected int i2;
    int i3;

    public static Character[] toObject(char[] chs) {
        Character[] charArray =  new Character[chs.length];
        for (int i = 0; i < chs.length; i++) {
            charArray[i] = new Character(chs[i]);
        }
        return charArray;
    }

     public static Character[] toObject(String s) {
        char chs[] = s.toCharArray();
        Character[] charArray =  new Character[chs.length];
        for (int i = 0; i < chs.length; i++) {
            charArray[i] = new Character(chs[i]);
        }
        return charArray;
    }

    public static Integer[] toObject(int[] ints) {
        Integer[] intArray =  new Integer[ints.length];
        for (int i = 0; i < ints.length; i++) {
            intArray[i] = new Integer(ints[i]);
        }
        return intArray;
    }

    public static Float[] toObject(float[] ints) {
        Float[] intArray =  new Float[ints.length];
        for (int i = 0; i < ints.length; i++) {
            intArray[i] = new Float(ints[i]);
        }
        return intArray;
    }

}
