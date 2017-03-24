package ch15.ex29.integra;

import lib.utils.Holder;

/**
 * Created by V1 on 20.03.2017.
 */
public class Capture {
    public <T> void f1(Holder<T> h) {
        T tVal = h.getValue();
        System.out.println("f1() tVal:"+tVal.getClass().getSimpleName());
    }

    public void f2(Holder<?> h) {  // через обобщенный тип
        f1(h);  // вызываем Generic для уточнения типа
    }

}
