package hw.vpex.arrays;

import java.util.Scanner;

/**
 * Vadim Voronov
 * Created: 16-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Pascal {

    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваш текст:");
        String s = in.nextLine(); // введена строка текста

        String res = "";
        for (char c : s.toCharArray()) {
            res += String.format("%02X",(int)c);
        }
        System.out.println("Шифр:"+res);
    }

    public static void main(String[] args) {
        String[] s4 = new String[]{"0000", "0001", "0010", "0011", "0100", "0101", "0110",
                "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        String[] s5 = new String[]{"0", "1", "2", "3", "4", "5", "6",
                "7", "8", "9", "A", "B", "C", "D", "E", "F"
        };
        String[] a = new String[100000]; // пустой массив длина строки не может быть фиксирована
        String s = "", kod = "", t = "", rez = "";
        int x;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваш текст:");
        s = in.nextLine(); // введена строка текста

        for (int i = 0; i < s.length(); i++) {
            x = (int) Character.valueOf(s.charAt(i)); // получить код ASCII
            a[i] = "";  // n работает с нуля
            while (x > 0) {
                a[i] = (char) ((x % 2) + 48) + a[i];
                x = (x / 2);
            }
            while (a[i].length() < 8) {
                a[i] = "0" + a[i];
            }
        } // отработали весь массив
        kod = "";
        for (int i = 0; i < s.length(); i++) {
            kod += a[i];
        }

        for (int i = 0; i < kod.length(); i += 4) {
            t = kod.substring(i, i + 4);
            for (int j = 0; j < s4.length; j++) {
                if (s4[j].equals(t)) {
                    rez = rez+ s5[j];
                }
            }
        }
        System.out.println("Шифр:" + rez);
    }
}
