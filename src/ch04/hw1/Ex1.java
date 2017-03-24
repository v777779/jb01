package ch04.hw1;

/**
 * Created by V1 on 05-Feb-17.
 */
public class Ex1 {
    public static void main(String[] args) {

        System.out.println("Check Cyacles and Labels");

        int i = 0;
       label1:
        while (i++ < 150) {
            if (i % 9 == 0) {
                System.out.println("i=" + i);
                continue label1;                // работает как continue;
            }
            System.out.print("Label2 i="+i+" > ");
            label2:
            for (int j = 0; j < 100; j++) {
                if (i % 15 == 0) {
                    System.out.println("\ni=" + i + " continue while by %15");
                    continue label1;            // выпрыгивает во внешний цикл
                }
                if (j % 9 == 0) {
                    System.out.print(j+" ");
                    continue label2;            // работает как обычный continue
                }
                if (i == 132) {
                    System.out.println("\ni=" + i + " break while by 132");
                    break label1;               // выход из внешнего while
                }
            }
            System.out.println();
        }

        System.out.println("\n Switch Case Block\n");

        for (int j = 0; j <= 8 ; j++) {
            switch (j) {
                case 0:
                    System.out.println("case "+j);
                    break;
                case 1:
                    System.out.println("case "+j);
                    break;
                case 2:
                    System.out.println("case "+j);
                    break;
                case 3:
                    System.out.println("case "+j);
                    break;
                case 4:
                    System.out.println("case "+j);
                    break;
                case 5:
                    System.out.println("case "+j);
                    break;
                case 6:
                    System.out.println("case "+j);
                    break;
                case 7:
                    System.out.println("case "+j);
                    break;
                default:
                    System.out.println("default");
                    break;
            }
        }

    }
}
