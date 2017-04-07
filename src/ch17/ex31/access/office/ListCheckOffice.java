package ch17.ex31.access.office;

import lib.tests.Test;
import lib.tests.TestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 02-Apr-17.
 */
public class ListCheckOffice {
    public static List<Test<List<String>>> tests = new ArrayList<>();
    //0
    static {  // статический блок инициализации tests и qtests
        tests.add(new Test<List<String>>("addget") {  // имя теста "sort"
                      @Override
                      public int test(List<String> list, TestParam tp) {  // внешний List<Integer>
                          int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              for (int j = 0; j < size ; j++) {
                                  list.add(""+j);  // same Integer.toString(i)
                                  list.get(j);
                              }
                          }
                          return size*loops;
                      } // test()
                  }//new Test{}
        );
    }

}
