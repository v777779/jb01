package ch17.ex32.access.office;

import lib.tests.Test;
import lib.tests.TestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 02-Apr-17.
 */
public class IntegerCheckOffice {
    public static List<Test<ContIntOffice>> tests = new ArrayList<>();
    //0
    static {  // статический блок инициализации tests и qtests
        tests.add(new Test<ContIntOffice>("addset") {  // имя теста "sort"
                      @Override
                      public int test(ContIntOffice cs, TestParam tp) {  // внешний List<Integer>
                          int loops = tp.loops;
                          int size = tp.size;
                          for (int i = 0; i < loops; i++) {
                              for (int j = 0; j < size ; j++) {
                                  cs.add(j);
                                  cs.set(j,cs.get(j)+1);
                              }
                          }
                          return size*loops;
                      } // test()
                  }//new Test{}
        );
    }

}
