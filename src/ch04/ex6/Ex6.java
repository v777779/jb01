package ch04.ex6;

/**
 * Created by V1 on 05-Feb-17.
 */
public class Ex6 {
    public static void main(String[] args) {
        ForEach.outChars("test data string");

        for (int i : Range.rangeInt(25)) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : Range.rangeInt(5, 25)) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : Range.rangeInt(5, 25, 3)) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nIf Else Block");
        System.out.println("10  5 > " + Test.test(10, 5));
        System.out.println(" 5 10 > " + Test.test(5, 10));
        System.out.println(" 5  5  > " + Test.test(5, 5));
        System.out.println(" 1,7 5 > " + Test.test(5, 1, 7));
        System.out.println(" 1,7 10 > " + Test.test(10, 1, 7));

        System.out.println("\nBreak Continue Cycles");
        for (int i = 0; i < 100; i++) {
            if (i == 74) {
                break;
            }

            if (i % 9 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : Range.rangeInt(100)) {
            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("\nInfinite loop");
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 2700) {
                break;
            }
            if (i % 10 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();


    }
}


