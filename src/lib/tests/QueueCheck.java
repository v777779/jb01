package lib.tests;

import lib.generate.GenList;

import java.util.*;

/**
 * Created by V1 on 02-Apr-17.
 */
public class QueueCheck {
    private static Random rnd = new Random();
    private static int repeats = 1000; // число повторов
    public static List<Test<LinkedList<Integer>>> tests = new ArrayList<>();

    static {  // статический блок инициализации tests и qtests
        tests.add(new Test<LinkedList<Integer>>("addFirst") {  // имя теста "addFirst"
                      @Override
                      public int test(LinkedList<Integer> list, TestParam tp) {  // внешний List<Integer>
                          int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              list.clear();  // перед тестом стираем список
                              for (int j = 0; j < size; j++) { // заполняем весь список на loop
                                  list.addFirst(j);          //  добавление
                              }
                          }
                          return loops * size;
                      } // test()
                  }//new Test{}
        );
        tests.add(new Test<LinkedList<Integer>>("addLast") {  // имя теста "addLast"
                      @Override
                      public int test(LinkedList<Integer> list, TestParam tp) {  // внешний LinkedList<Integer>
                          int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              list.clear();  // перед тестом стираем список
                              for (int j = 0; j < size; j++) { // заполняем весь список на loop
                                  list.addLast(j);          //  добавление
                              }
                          }
                          return loops * size;
                      } // test()
                  }//new Test{}
        );

        tests.add(new Test<LinkedList<Integer>>("rmFirst") {  // имя теста "rmFirst"
                      @Override
                      public int test(LinkedList<Integer> list, TestParam tp) {  // внешний List<Integer>
                          final int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              list.clear();
                              list.addAll(new GenList<Integer>(size));
                              while (list.size() > 0) {
                                  list.removeFirst(); // удалять до упора
                              }
                          }
                          return loops*size;
                      } // test()
                  }//new Test{}
        );

        tests.add(new Test<LinkedList<Integer>>("rmLast") {  // имя теста "rmLast"
                      @Override
                      public int test(LinkedList<Integer> list, TestParam tp) {  // внешний List<Integer>
                          final int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              list.clear();
                              list.addAll(new GenList<Integer>(size));
                              while (list.size() > 0) {
                                  list.removeLast(); // удалять до упора
                              }
                          }
                          return loops*size;
                      } // test()
                  }//new Test{}
        );

    }
}
