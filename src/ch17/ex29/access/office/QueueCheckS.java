package ch17.ex29.access.office;

import lib.maps.Countries;
import lib.tests.Test;
import lib.tests.TestParam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by V1 on 02-Apr-17.
 */
public class QueueCheckS {
    private static Random rnd = new Random();
    private static int repeats = 1000; // число повторов
    public static List<Test<LinkedList<String>>> tests = new ArrayList<>();

    static {  // статический блок инициализации tests и qtests
        tests.add(new Test<LinkedList<String>>("addFirst") {  // имя теста "addFirst"
                      @Override
                      public int test(LinkedList<String> list, TestParam tp) {  // внешний List<String>
                          int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              list.clear();  // перед тестом стираем список
                              for (int j = 0; j < size; j++) { // заполняем весь список на loop
                                  list.addFirst("Hello");          //  добавление
                              }
                          }
                          return loops * size;
                      } // test()
                  }//new Test{}
        );
        tests.add(new Test<LinkedList<String>>("addLast") {  // имя теста "addLast"
                      @Override
                      public int test(LinkedList<String> list, TestParam tp) {  // внешний LinkedList<String>
                          int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              list.clear();  // перед тестом стираем список
                              for (int j = 0; j < size; j++) { // заполняем весь список на loop
                                  list.addLast("Step");          //  добавление
                              }
                          }
                          return loops * size;
                      } // test()
                  }//new Test{}
        );

        tests.add(new Test<LinkedList<String>>("rmFirst") {  // имя теста "rmFirst"
                      @Override
                      public int test(LinkedList<String> list, TestParam tp) {  // внешний List<String>
                          final int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              list.clear();
                              while(size > 50){
                                  list.addAll(Countries.names(size));
                                  size -= 50;
                              }
                              list.addAll(Countries.names(size));
                              while (list.size() > 0) {
                                  list.removeFirst(); // удалять до упора
                              }
                          }
                          return loops*size;
                      } // test()
                  }//new Test{}
        );

        tests.add(new Test<LinkedList<String>>("rmLast") {  // имя теста "rmLast"
                      @Override
                      public int test(LinkedList<String> list, TestParam tp) {  // внешний List<String>
                          final int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              list.clear();
                              while(size > 50){
                                  list.addAll(Countries.names(size));
                                  size -= 50;
                              }
                              list.addAll(Countries.names(size));
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
