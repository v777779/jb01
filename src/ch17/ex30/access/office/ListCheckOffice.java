package ch17.ex30.access.office;

import lib.generate.GenList;
import lib.tests.Test;
import lib.tests.TestParam;

import java.util.*;

/**
 * Created by V1 on 02-Apr-17.
 */
public class ListCheckOffice {
    public static List<Test<List<Integer>>> tests = new ArrayList<>();
    //0
    static {  // статический блок инициализации tests и qtests
        tests.add(new Test<List<Integer>>("sort") {  // имя теста "sort"
                      @Override
                      public int test(List<Integer> list, TestParam tp) {  // внешний List<Integer>
                          int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              list.clear();
                              list.addAll(new GenList(size));
                              Collections.sort(list);
                          }
                          return loops;
                      } // test()
                  }//new Test{}
        );
    }

}
