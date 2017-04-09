package ch18.ex14.exercise;

import lib.files.BFileRead;
import lib.tests.Test;
import lib.tests.TestParam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by V1 on 02-Apr-17.
 */
public class BFileCheck {
    private static Random rnd = new Random();
    public static List<Test<List<String>>> tests = new ArrayList<>();
    private static String fileName = "./src/ch18/ex14/exercise/BFileCheck.java";
    private static String fileName2 = "./src/ch18/ex14/exercise/BFileCheckBW.txt";
    private static String fileName3 = "./src/ch18/ex14/exercise/BFileCheckFW.txt";

    //0
    static {  // статический блок инициализации tests и qtests
        tests.add(new Test<List<String>>("bread") {  // имя теста "get"
                      @Override
                      public int test(List<String> list, TestParam tp) {  // внешний List<Integer>
                          int loops = tp.loops;
                          int size = (int) new File(fileName).length();
                          try {
                              int value;
                              for (int i = 0; i < loops; i++) {             // читаем 1000 раз на loop
                                  BufferedReader in = new BufferedReader(new FileReader(fileName));
                                  size = 0;
                                  while ((value = in.read()) != -1) {     // читаем строку за строкой из файла в s
                                      size++;
                                  }
                                  in.close();// закрываем поток
                              }
                          } catch (IOException e) {
                              throw new RuntimeException(e);
                          }
                          return loops * size;
                      } // test()
                  }//new Test{}
        );
        tests.add(new Test<List<String>>("fread") {  // имя теста "get"
                      @Override
                      public int test(List<String> list, TestParam tp) {  // внешний List<Integer>
                          int loops = tp.loops;
                          int size = (int) new File(fileName).length();
                          try {
                              int value;
                              for (int i = 0; i < loops; i++) {             // читаем 1000 раз на loop
                                  FileReader in = new FileReader(fileName);
                                  size = 0;
                                  while ((value = in.read()) != -1) {     // читаем строку за строкой из файла в s
                                      size++;
                                  }
                                  in.close();// закрываем поток
                              }
                          } catch (IOException e) {
                              throw new RuntimeException(e);
                          }
                          return loops * size;
                      } // test()
                  }//new Test{}
        );
        tests.add(new Test<List<String>>("bwrite") {  // имя теста "get"
                      @Override
                      public int test(List<String> list, TestParam tp) {  // внешний List<Integer>
                          int loops = tp.loops;
                          int size;
                          char[] chs = BFileRead.readString(fileName).toCharArray(); // массив символов
                          new File(fileName2).delete(); // стереть если есть
                          try {
                              int value;
                              for (int i = 0; i < loops; i++) {             // читаем 1000 раз на loop
                                  BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2));
                                  for (char ch : chs) {
                                      bw.write(ch); // записать по символу
                                  }
//                                  bw.write(chs); // записать целый буфер
                                  bw.close();// закрываем поток
                              }
                          } catch (IOException e) {
                              throw new RuntimeException(e);
                          }
                          size = (int) new File(fileName2).length(); // стереть если есть

                          return loops * size;
                      } // test()
                  }//new Test{}
        );
        tests.add(new Test<List<String>>("fwrite") {  // имя теста "get"
                      @Override
                      public int test(List<String> list, TestParam tp) {  // внешний List<Integer>
                          int loops = tp.loops;
                          int size;
                          char[] chs = BFileRead.readString(fileName).toCharArray(); // массив символов
                          new File(fileName2).delete(); // стереть если есть
                          try {
                              int value;
                              for (int i = 0; i < loops; i++) {             // читаем 1000 раз на loop
                                  FileWriter fw = new FileWriter(fileName2);
                                  for (char ch : chs) {
                                      fw.write(ch); // записать целый буфер
                                  }
//                                  fw.write(chs); // записать целый буфер
                                  fw.close();// закрываем поток
                              }
                          } catch (IOException e) {
                              throw new RuntimeException(e);
                          }
                          size = (int) new File(fileName2).length(); // стереть если есть

                          return loops * size;
                      } // test()
                  }//new Test{}
        );
    }
}
