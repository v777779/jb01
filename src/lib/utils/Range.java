package lib.utils;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Range {
    static Random rnd = new Random();

    public static int getInt(int range) {
        return rnd.nextInt(range);
    }

    public static ArrayList<Integer> arrayList(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j = 0; j < size; j++) {
            arrayList.add(rnd.nextInt(100));
        }
        return arrayList;
    }


    public static int[] rangeInt(int i) {
        int[] ints = new int[i];
        for (int j = 0; j < ints.length; j++) {
            ints[j] = j;//rnd.nextInt(50)+50;
        }
        return ints;
    }

    public static float[] rangeFloat(int i) {
        float[] array = new float[i];
        for (int j = 0; j < array.length; j++) {
            array[j] = rnd.nextFloat() * 25;
        }
        return array;
    }

    public static double[] rangeDouble(int i) {
        double[] array = new double[i];
        for (int j = 0; j < array.length; j++) {
            array[j] = rnd.nextDouble() * 25;
        }
        return array;
    }

    public static ArrayList<Double> rangeDoubleList(int size) {
        ArrayList<Double> list = new ArrayList<>();
        for (int j = 0; j < size; j++) {
            list.add(rnd.nextDouble() * 25);
        }
        return list;
    }


    public static String[] rangeStr(int i) {
        String[] s = new String[i];
        for (int j = 0; j < s.length; j++) {
            s[j] = "StrData " + (j);
        }
        return s;
    }

    @Override
    public String toString() {
        return "Range{}";
    }
}
