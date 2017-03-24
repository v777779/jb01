package ch04.ex4;

/**
 * Created by V1 on 04-Feb-17.
 */
public class Ex4 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (((i % j) == 0) && (i != j)) {
                    break;
                }
                if (i == j) {
                    System.out.print(i + ",_");
                }
            }
        }
        System.out.println();
    }

}
