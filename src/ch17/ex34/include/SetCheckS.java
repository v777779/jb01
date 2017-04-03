package ch17.ex34.include;

import lib.tests.Test;
import lib.tests.TestParam;

import java.util.*;

/**
 * Created by V1 on 02-Apr-17.
 */
public class SetCheckS {
    private static Random rnd = new Random();
    public static List<Test<Set<String>>> tests = new ArrayList<>();


    static {  // статический блок инициализации tests и qtests
//0
        tests.add(new Test<Set<String>>("add") {  // имя теста "add"
                      @Override
                      public int test(Set<String> set, TestParam tp) {  // внешний Set<String>
                          int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              set.clear();                          // перед тестом стираем список
                              for (int j = 0; j < size; j++) {      // заполняем весь список на loop
                                  set.add("Hello"+j);                       //  добавление
                              }
                          }
                          return loops * size;
                      } // test()
                  }//new Test{}
        );
//1
        tests.add(new Test<Set<String>>("contains") {
                      @Override
                      public int test(Set<String> set, TestParam tp) {  // внешний Set<String>
                          int loops = tp.loops;
                          int span = tp.size * 2;
                          for (int i = 0; i < loops; i++) {
                              for (int j = 0; j < span; j++) {
                                  set.contains("Hello"+j);                  // проверка на наличие
                              }
                          }
                          return loops * span;
                      } // test()
                  }//new Test{}
        );
//2
        tests.add(new Test<Set<String>>("iterate") {
                      @Override
                      public int test(Set<String> set, TestParam tp) {  // внешний Set<String>
                          int loops = tp.loops * 10;
                          for (int i = 0; i < loops; i++) {
                              Iterator<String> it = set.iterator();
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
