package ch09.ex16;

import ch09.ex16.access.CharAdapter;
import ch09.ex16.adapter.DoubleAdapter;
import ch09.ex16.read.RandomWords;

import java.util.Scanner;

/**
 * Created by V1 on 13-Feb-17.
 */
public class Ex16 {
    public static void main(String[] args) {
        System.out.println("\nScanner Int Readable Interface Check\n");
        Scanner in  = new Scanner(new RandomWords());
        GenClass.show(in);

        System.out.println("\nScanner Double Readable Interface Adapter Check\n");
        Scanner sc = new Scanner(new DoubleAdapter());
        GenClass.show(sc);
        System.out.println("\nExercise 16 Char Readable Interface Adapter Check\n");
        Scanner pass = new Scanner(new CharAdapter());  // собственно генерация 8 слов по 12 символов
        GenClass.show(pass);
    }
}
