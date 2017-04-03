package lib.tests;

import java.util.*;

/**
 * Created by V1 on 02-Apr-17.
 */
public class MapCheck {
    private static Random rnd = new Random();
    public static List<Test<Map<Integer,Integer>>> tests = new ArrayList<>();


    static {  // статический блок инициализации tests и qtests
//0
        tests.add(new Test<Map<Integer,Integer>>("put") {
                      @Override
                      public int test(Map<Integer,Integer> map, TestParam tp) {  // внешний Map<Integer,Integer>
                          int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              map.clear();                              // перед тестом стираем список
                              for (int j = 0; j < size; j++) {          // заполняем весь список на loop
                                  map.put(j,j);                         //  добавление
                              }
                          }
                          return loops * size;
                      } // test()
                  }//new Test{}
        );
//1
        tests.add(new Test<Map<Integer,Integer>>("get") {
                      @Override
                      public int test(Map<Integer,Integer> map, TestParam tp) {  // внешний Map<Integer,Integer>
                          int loops = tp.loops;
                          int span = tp.size * 2;
                          for (int i = 0; i < loops; i++) {
                              for (int j = 0; j < span; j++) {
                                  map.get(j);                  // проверка на наличие
                              }
                          }
                          return loops * span;
                      } // test()
                  }//new Test{}
        );
//2
        tests.add(new Test<Map<Integer,Integer>>("iterate") {
                      @Override
                      public int test(Map<Integer,Integer> map, TestParam tp) {  // внешний Map<Integer,Integer>
                          int loops = tp.loops * 10;
                          for (int i = 0; i < loops; i++) {
                              Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();
                              while (it.hasNext()) {
                                  it.next();
                              }
                          }
                          return loops * map.size();
                      } // test()
                  }//new Test{}
        );
    }
}
