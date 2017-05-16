package hw.vpex;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Vadim Voronov
 * Created: 16-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Praktic5 {

    public static void main(String[] args) {
        /*Объявление переменных*/
        int j, i, c;
        int M, N, K, L;
        String fileName = "C:\\Users\\Юлия\\Desktop\\Кроссплатформенное прграммирование\\praktika5\\Fail5.txt";

/*Объявление переменных*/
        Scanner in = new Scanner(System.in);
        System.out.println("Введите:");
        System.out.println("1 для формирования двумерного массива случайных чисел;");
        System.out.print("Ввод:");
        M = in.nextInt();/*Переменная, которой присваивается число, введённое пользователем с клавиатуры*/

        int[][] matrix = new int[9][9];
        String[] str1 = new String[100];
        String[] str2 = new String[100];
        int[][] matrix1 = new int[9][9];
        char[][] massiv = new char[9][9];
        Random rand = new Random();
        switch (M) {
            case 1:
                for (i = 0; i < 9; i++) {
                    for (j = 0; j < 9; j++) {
                        matrix[i][j] = rand.nextInt(9);
                        System.out.print(" " + matrix[i][j]);
                    }
                    System.out.println();
                }

                break;

            default:
                System.out.println("Ошибка");
                break;
        }
        System.out.println("Введите:");
        System.out.println("2 для записи сформированного массива в файл;");
        System.out.print("Ввод:");
        N = in.nextInt();/*Переменная, которой присваивается число, введённое пользователем с клавиатуры*/
        switch (N) {
            case 2:
                System.out.print("Содержание файла: ");
/*Запись массива в файл*/
                try (final FileWriter writer = new FileWriter(fileName, false)) {
                    for (i = 0; i < 9; ++i) {
                        for (j = 0; j < 9; j++) {
                            final String s = Integer.toString(matrix[i][j]);
                            writer.write(s);
//writer.write(System.lineSeparator());
                            System.out.print(matrix[i][j]);
                        }
                    }
//writer.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
/*Запись массива в файл*/
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
        System.out.println(" ");

        System.out.println("Введите:");
        System.out.println("3 для чтения файла;");
        System.out.print("Ввод:");
        K = in.nextInt();/*Переменная, которой присваивается число, введённое пользователем с клавиатуры*/
        System.out.println("Содержание файла: ");
        switch (K) {
            case 3:
                try (FileReader reader = new FileReader(fileName)) {
                    for (i = 0; i < 9; i++) {
                        for (int k = 0; k < 9; k++) {
                            c = reader.read();
                            char c1;
                            if ((c == 55 || c == 50)) { //Если в строке есть числа 2,7, то они записываются в массив
                                c1 = (char) c;
                            } else {
                                c1 = '*';  // пробел 0
                            }
                            massiv[i][k] = c1;
                            System.out.print(massiv[i][k] + " ");
                        }
                        System.out.println();
                    }
                    reader.close();

                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
        System.out.println(" ");

        System.out.println("Введите:");
        System.out.println("4 для записи в файл;");
        System.out.print("Ввод:");
        L = in.nextInt();/*Переменная, которой присваивается число, введённое пользователем с клавиатуры*/
        System.out.println("Содержание файла: ");
        switch (L) {
            case 4:
                try (FileWriter newwriter = new FileWriter(fileName)) {
                    for (i = 0; i < 9; i++) {
                        for (int k = 0; k < 9; k++) {
                            newwriter.write(massiv[i][k]);
                            System.out.print(massiv[i][k] + " ");
                        }
                        System.out.println();
                    }
                    newwriter.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

                break;
            default:
                System.out.println("Ошибка");
                break;
        }
        System.out.println("Введите:");
        System.out.println("5 для удаления файла(0 выход)");
        System.out.print("Ввод:");
        L = in.nextInt();/*Переменная, которой присваивается число, введённое пользователем с клавиатуры*/
        switch (L) {
            case 5:
                // File file = new File(fileName);
                try {
                    File file = new File(fileName);
                    if (file.delete()) {
                        System.out.println("Файл "+file.getName()+" удален");
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                break;
        }

        System.out.println("Выход из программы");

    }
}
