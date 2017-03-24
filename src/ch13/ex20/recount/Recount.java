package ch13.ex20.recount;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Recount {
    public static void app() {
        System.out.println("\n====RECOUNT===");
        System.out.println("\nStringTokenizer Check\n");
        String s = "Im'not ready yet! But I feel happy!";
        StringTokenizer stk = new StringTokenizer(s);  // класс для работы со стороками и  Scanner
        System.out.print("StringTokenizer: ");
        while (stk.hasMoreElements()) {
            System.out.print(stk.nextToken()+" "); // прогнать все элементы в строку
        }
        System.out.println();

        System.out.print("Arrays.toString:");
        System.out.println(Arrays.toString(s.split(" "))); // распечатать входную строку


        System.out.print("Scanner        : ");
        Scanner scanner = new Scanner(s);
        while (scanner.hasNext()) {
            System.out.print(scanner.next()+" ");
        }
        System.out.println();

    }
}
