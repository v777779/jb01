package ch04.ex06;

/**
 * Created by V1 on 05-Feb-17.
 */
public class Range {
    static  int[] rangeInt(int size) {
        int[] ints = new int[size];
        for (int i = 0; i < size ; i++) {
            ints[i]=i;
        }
        return ints;
    }

    static  int[] rangeInt(int i, int j) {
        int[] ints;

        try {
            ints = new int[j-i];
            for (int k = 0; k < ints.length ; k++) {
                ints[k]=i+k;
            }
        } catch (Exception e) {
            ints = new int[]{0};
        }

        return ints;
    }

    static  int[] rangeInt(int i, int j, int step) {
        int[] ints;
        int size =  (j-i)/step;
            size =  ((j-i)%step == 0)? (j-i)/step:(j-i)/step+1;
        try {
            ints = new int[size];
            for (int k = 0; k < ints.length ; k++) {
                ints[k]=i+k*step;
            }
        } catch (Exception e) {
            ints = new int[]{0};
        }
        return ints;
    }

}
