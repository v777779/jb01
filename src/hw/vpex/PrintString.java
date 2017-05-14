package hw.vpex;

import java.util.Scanner;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class PrintString {
    public static int printAndRead2(String string) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print(string);

            if (in.hasNextInt()) {
                return in.nextInt();
            }else {
                in.next();
                System.out.println("Введено не целое число ");
            }
        }
    }

    public static int printAndRead(String string) {
        Scanner in = new Scanner(System.in);
                return in.nextInt();
    }

    public static void main(String[] args) {
        int a = printAndRead("Введите число:");
        System.out.println(a);
    }
}
