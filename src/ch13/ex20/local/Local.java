package ch13.ex20.local;

import java.io.BufferedReader;
import java.io.StringReader;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nScan Check\n");
        String s = "Sir Robin\n22 1.61803";  // исходная строка
        StringReader sr = new StringReader(s);          // в объект string reader
        BufferedReader bf = new BufferedReader(sr);     // класс буфера

        try {
            System.out.println("Name?");
            String name = bf.readLine();                // ввод данных из буфера
            System.out.println("Name     :"+    name);
            System.out.println("Age? Val?");
            String values = bf.readLine();
            System.out.println("Age Val  :"+values);
            String [] n = values.split(" ");
            int age = Integer.valueOf(n[0]);
            double val = Double.valueOf(n[1]);
            System.out.println("Data:");
            System.out.printf("Name:%s  Age: %d Val: %5.3f\n",name,age,val);


        } catch (Exception e) {

        }
    }
}
