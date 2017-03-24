package ch13.ex20.include;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nScanner Check\n");

        String s = "Sir Robin of Camelot\n22 1.61803";  // исходная строка
        StringReader sr = new StringReader(s);          // в объект string reader
        BufferedReader bf = new BufferedReader(sr);     // класс буфера

        Scanner in = new Scanner(bf); // ввод в буфер
        System.out.println("Name?");
        String name = in.nextLine();                // ввод данных из буфера
        System.out.println("Name     :"+    name);
        System.out.println("Age? Val?");
        String values = in.nextLine();
        System.out.println("Age Val  :"+values);
        String [] n = values.split(" ");
        int age = Integer.valueOf(n[0]);
        double val = Double.valueOf(n[1]);
        System.out.println("Data:");
        System.out.printf("Name:%s  Age: %d Val: %5.3f\n",name,age,val);

    }
}
