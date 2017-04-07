package ch17.ex32.access.office;

import lib.tests.Test;
import lib.tests.TestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 02-Apr-17.
 */
public class ListCheckOffice {
    public static List<Test<List<Integer>>> tests = new ArrayList<>();
    //0
    static {  // статический блок инициализации tests и qtests
        tests.add(new Test<List<Integer>>("addset") {  // имя теста "sort"
                      @Override
                      public int test(List<Integer> list, TestParam tp) {  // внешний List<Integer>
                          int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              for (int j = 0; j < size; j++) {
                                  list.add(j);  //
                                  list.set(j,list.get(j)+1);
                              }
                          }
                          return size*loops;
                      } // test()
                  }//new Test{}
        );
    }

}
