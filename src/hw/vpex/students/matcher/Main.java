package hw.vpex.students.matcher;

import java.util.Scanner;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcdef12345";
        int lenMax = s.length();

        String shab = "([a-f1-5]+)";

        System.out.print("Введите строку:");
        s = sc.nextLine();

        Pattern p1 = Pattern.compile(shab);
        Matcher m1 = p1.matcher(s);
        if (m1.find()) {
            if (m1.group().length() == lenMax) {
                System.out.println("Все символы найдены");
            } else {
                System.out.println("Найдены не все символы");
            }
        } else {
            System.out.println("Символы не найдены");
        }
    }
}