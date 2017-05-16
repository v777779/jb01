package hw.vpex.arrays;

import java.util.Scanner;

/**
 * Vadim Voronov
 * Created: 16-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Pascal2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваш текст:");
        String s = in.nextLine(); // введена строка текста

        String res = "";
        for (char c : s.toCharArray()) {
            res += String.format("%02X",(int)c);
        }
        System.out.println("Шифр:"+res);
    }

}
