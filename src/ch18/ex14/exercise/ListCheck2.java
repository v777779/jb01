package ch18.ex14.exercise;

import lib.tests.Test;
import lib.tests.TestParam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by V1 on 02-Apr-17.
 */
public class ListCheck2<T> {
    private static Random rnd = new Random();
    public List<Test<List<T>>> tests = new ArrayList<>();
//0
    {  // статический блок инициализации tests и qtests
        tests.add(new Test<List<T>>("get") {  // имя теста "get"
                      @Override
                      public int test(List<T> list, TestParam tp) {  // внешний List<Integer>
                          int loops = tp.loops;
                          int size = list.size();
                          for (int i = 0; i < loops; i++) {  // читаем 1000 раз на loop
                              list.get(rnd.nextInt(size));  // просто чтение
                          }
                          return loops;
                      } // test()
                  }//new Test{}
        );
//1
        tests.add(new Test<List<T>>("iter") {  // имя теста "iterator"
                      @Override
                      public int test(List<T> list, TestParam tp) {  // внешний List<Integer>
                          final int loops = tp.loops;
                          final int size =  list.size();
                          for (int i = 0; i < loops; i++) {
                              Iterator<T> it = list.iterator();
                              while (it.hasNext()) {
                                  it.next();
                              }
                          }
                          return loops*size;
                      } // test()
                  }//new Test{}
        );
    }

}
