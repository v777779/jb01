package lib.tests;

import lib.generate.GenList;

import java.util.*;

/**
 * Created by V1 on 02-Apr-17.
 */
public class ListCheck {
    private static Random rnd = new Random();
    private static int repeats = 1000; // число повторов
    public static List<Test<List<Integer>>> tests = new ArrayList<>();
//0
    static {  // статический блок инициализации tests и qtests
        tests.add(new Test<List<Integer>>("add") {  // имя теста "add"
                      @Override
                      public int test(List<Integer> list, TestParam tp) {  // внешний List<Integer>
                          int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              list.clear();  // перед тестом стираем список
                              for (int j = 0; j < size; j++) { // заполняем весь список на loop
                                  list.add(j);          //  добавление
                              }
                          }
                          return loops * size;
                      } // test()
                  }//new Test{}
        );
//1
        tests.add(new Test<List<Integer>>("get") {  // имя теста "get"
                      @Override
                      public int test(List<Integer> list, TestParam tp) {  // внешний List<Integer>
                          int loops = tp.loops * repeats;
                          int size = list.size();
                          for (int i = 0; i < loops; i++) {  // читаем 1000 раз на loop
                              list.get(rnd.nextInt(size));  // просто чтение
                          }
                          return loops;
                      } // test()
                  }//new Test{}
        );
//2
        tests.add(new Test<List<Integer>>("set") {  // имя теста "add"
                      @Override
                      public int test(List<Integer> list, TestParam tp) {  // внешний List<Integer>
                          int loops = tp.loops*repeats;
                          int size = list.size();
                          for (int i = 0; i < loops; i++) {
                                  list.set(rnd.nextInt(size),i);  // пишем 1000 раз на loop

                          }
                          return loops;
                      } // test()
                  }//new Test{}
        );
//3
        tests.add(new Test<List<Integer>>("iteradd") {  // имя теста "add"
                      @Override
                      public int test(List<Integer> list, TestParam tp) {  // внешний List<Integer>
                          final int LOOPS = (int)1e6; // 1e6;
                          int half = list.size()/2;  // добавлять с половины списка
                          ListIterator<Integer> it = list.listIterator();
                          for (int i = 0; i < LOOPS; i++) {
                              it.add(i);  // в середину списка добавать 1e6 данных
                          }
                          return LOOPS;
                      } // test()
                  }//new Test{}
        );
//4
        tests.add(new Test<List<Integer>>("insert") {  // имя теста "insert"
                      @Override
                      public int test(List<Integer> list, TestParam tp) {  // внешний List<Integer>
                          final int loops = tp.loops;
                          for (int i = 0; i < loops; i++) {
                              list.add(5,i);  // в начало списка с 5й позиции
                          }
                          return loops;
                      } // test()
                  }//new Test{}
        );
//5
        tests.add(new Test<List<Integer>>("remove") {  // имя теста "remove"
                      @Override
                      public int test(List<Integer> list, TestParam tp) {  // внешний List<Integer>
                          final int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              list.clear();
                              list.addAll(new GenList<Integer>(size));
                              while (list.size() > 5) {
                                  list.remove(5); // удалять 5й индекс до упора
                              }
                          }
                          return loops*size;
                      } // test()
                  }//new Test{}
        );
    }

}
