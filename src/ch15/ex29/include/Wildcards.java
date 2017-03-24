package ch15.ex29.include;

import lib.utils.Holder;

/**
 * Created by V1 on 20.03.2017.
 */
public class Wildcards {
    public void rawArg(Holder h, Object arg) {
        h.setValue(arg);            // работает
        Object obj = h.getValue();  // работает  замена типа

        System.out.println(obj);
     }

    public void unbArg(Holder<?> h, Object arg) {
//         h.setValue(arg);               // не работает
         Object obj = h.getValue();     // работает  замена типа

         System.out.println(obj);
     }

    public <T> T exact1(Holder<T> h) {
        T tValue = h.getValue();  // работает
         System.out.println(tValue);
        return  tValue;
     }

    public <T> T exact2(Holder<T> h, T sValue) {
        h.setValue(sValue);

        T tValue = h.getValue();  // работает
        System.out.println(tValue);
        return  tValue;
    }

    public <T> T subArg(Holder<? extends T> h, T sValue) {
//        h.setValue(sValue); // не работает
        T tValue = h.getValue();  // работает
        System.out.println(tValue);
        return  tValue;
    }

    public <T> T superArg(Holder<? super T> h, T sValue) {
        h.setValue(sValue); // не работает
//        T tValue = h.getValue();  // не работает
        T tValue = (T)h.getValue();  // не работает
        Object tObject = h.getValue(); // работает как Object
        System.out.println(tValue+" "+tValue.getClass().getSimpleName());
        System.out.println(tObject+" "+tObject.getClass().getSimpleName());
        return  tValue;
    }


}
