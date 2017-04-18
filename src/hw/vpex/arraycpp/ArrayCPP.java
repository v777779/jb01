package hw.vpex.arraycpp;

import lib.utils.Range;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class ArrayCPP {
    private int a[][] = new int[4][4];

    public ArrayCPP() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = Range.getInt(100);
            }
        }
    }

    public void sort() {
        int i, j, k, x;
        int n = 4;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                for (k = i; k < n; k++) {
                    if (a[i][j] < a[k][j]) {
                        x = a[k][j];
                        a[k][j] = a[i][j];
                        a[i][j] = x;
                    }
                }
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int i = 0; i < 4; i++) {
            sb.append("[");
            for (int j = 0; j < 4; j++) {
                sb.append(String.format("%3d ", a[i][j]));
            }
            sb.append("]\n");
        }
        sb.append("]\n");
        return sb.toString();
    }


    public static void main(String[] args) {
        ArrayCPP acpp = new ArrayCPP();

        System.out.println(acpp);
        acpp.sort();
        System.out.println(acpp);

    }
}
