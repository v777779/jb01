package hw.vpex.students.pascal.copy;

import java.util.Scanner;


public class PascalModule {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 System.out.print("Введите Ваш текст:");
 String s = in.nextLine(); // введена строка текста
// для проверки удалить комментарий
// s = "4379626572466F72756D";

 s = s.replaceAll("[^0-9A-F]", "");
 String kod = "";
 for (char c : s.toCharArray()) {
 kod += (String.format("%4s", (Integer.toBinaryString(Integer.valueOf("" + c,16))))).replaceAll(" ", "0");
 }

 double st = 7;
 double p = 0;
 String h = "";
 for (char c : kod.toCharArray()) {
 int g = c == '0' ? 0 : 1;
 p = p + g * Math.exp(Math.log(2) * st);
 if (st > 0) {
 st--;
 } else {
 h += (char) Math.round(p);
 st = 7;
 p = 0;
 }
 }
 System.out.println(h);

 }
}