package hw.ex3;

/**
 * Created by V1 on 05-Feb-17.
 */
public class Ex3 {

    static char[] trimCh(char[] chs) {
        String s = String.valueOf(chs);
        s.replace("*", "");
        return s.toCharArray();
    }

    static char[] trimAt(char[] chs, int i) {
        StringBuilder s = new StringBuilder(String.valueOf(chs));
        s.deleteCharAt(i);
        return s.toString().toCharArray();
    }

    public static void main(String[] args) {
        System.out.println("Found Numbers");
        int nset = 0;
        Label1:
        for (int n = 1000; n < 9999; n++) {
            char[] chs = Integer.toString(n).toCharArray();
            char[] resA = new char[2];
            char[] resB = new char[2];

            for (int i = 0; i < 4; i++) {
                resA[0] = chs[i];
                char[] chs_b = trimAt(chs, i);          // убрать символ в позиции
                for (int j = 0; j < chs_b.length; j++) {
                    resA[1] = chs_b[j];
                    char[] chs_c = trimAt(chs_b, j);  // убрать символ в позиции
                    for (int k = 0; k < chs_c.length; k++) {
                        resB[0] = chs_c[k];
                        char[] chs_d = trimAt(chs_c, k);  // убрать символ в позиции
                        resB[1] = chs_d[0];
                        int a = Integer.valueOf(String.valueOf(resA));
                        int b = Integer.valueOf(String.valueOf(resB));
                        int nMul = a * b;
                        if (nMul == n) {
                            nset++;
                            System.out.printf("%d. %d > %d%d > %d * %d = %d \n", nset, n, a, b, a, b, nMul);
                            continue Label1;
                        }
                    }
                }
            }
        }
        System.out.println();
    }
}
