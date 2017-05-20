package hw.vpex.students.string;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    static String S;
    static int num;
    static String[] SS;

    public static void main(String[] argv) {
        System.out.println("Введите текст");
        Scanner s = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        S = s.nextLine();                           // получить строку с консоли
        SS = S.split("\\s");                // разбить строку на слова по пробелам в массив SS[]
        for (int i = 0; i < SS.length; i++) {
            for (int j = i + 1; j < SS.length; j++) {
                if (slovo(SS[i], SS[j])) {              // сравнить все слова друг с другом SS[i] <> SS[j] используя метод slovo()
                    System.out.println(SS[i] + " " + SS[j]); // если результат true вывести оба слова
                    num++;
                }
            }
        }
        if (num == 0) {
            System.out.println("Таких слов не найдено");
        }
    }

    static boolean slovo(String S, String S1) { // метод slovo() сравнения двух слов,  S и S1
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        StringBuilder SS;
        SS = new StringBuilder(S);          // создать из строки S объект StringBuilder
        SS = SS.reverse();                  // перевернуть его (StringBuilder  наоборот
        return S1.equals(SS.toString());    // преобразовать StringBuilder в строку и сравнить со вторым словом
                                            // как две обычные строки, если совпадают true, нет false
    }
}