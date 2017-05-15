package hw.vpex.thread;

import java.util.Scanner;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MainCmdInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = 1;
        while(value != 0) {
            System.out.print("Введите целое число (0 exit):");
            if (in.hasNextInt()) {
                value = Integer.valueOf(in.next());
                System.out.println("Введено число :"+value);
            }else {
                System.out.println("Повторите ввод");
                in.next();
            }
        }
        System.out.println("Выход...");


    }
}
