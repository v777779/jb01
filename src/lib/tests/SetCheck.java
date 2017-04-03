package lib.tests;

import java.util.*;

/**
 * Created by V1 on 02-Apr-17.
 */
public class SetCheck {
    private static Random rnd = new Random();
    public static List<Test<Set<Integer>>> tests = new ArrayList<>();


    static {  // статический блок инициализации tests и qtests
//0
        tests.add(new Test<Set<Integer>>("add") {  // имя теста "add"
                      @Override
                      public int test(Set<Integer> set, TestParam tp) {  // внешний Set<Integer>
                          int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              set.clear();                          // перед тестом стираем список
                              for (int j = 0; j < size; j++) {      // заполняем весь список на loop
                                  set.add(j);                       //  добавление
                              }
                          }
                          return loops * size;
                      } // test()
                  }//new Test{}
        );
//1
        tests.add(new Test<Set<Integer>>("contains") {
                      @Override
                      public int test(Set<Integer> set, TestParam tp) {  // внешний Set<Integer>
                          int loops = tp.loops;
                          int span = tp.size * 2;
                          for (int i = 0; i < loops; i++) {
                              for (int j = 0; j < span; j++) {
                                  set.contains(j);                  // проверка на наличие
                              }
                          }
                          return loops * span;
                      } // test()
                  }//new Test{}
        );
//2
        tests.add(new Test<Set<Integer>>("iterate") {
                      @Override
                      public int test(Set<Integer> set, TestParam tp) {  // внешний Set<Integer>
                          int loops = tp.loops * 10;
                          for (int i = 0; i < loops; i++) {
                              Iterator<Integer> it = set.iterator();
                              while (it.hasNext()) {
                                  it.next();
                              }
                          }
                          return loops * set.size();
                      } // test()
                  }//new Test{}
        );
    }
}
