package ch.ex34.remote.ordarg;

import ch.ex34.remote.Derived;

/**
 * Created by V1 on 21.03.2017.
 */
public class DerivedSetter extends OrdinarySetter{
    public void set(Derived obj) {  // перегрузка метода
        System.out.println("DerivedSetter.set:"+obj.getClass().getSimpleName());
    }
}
