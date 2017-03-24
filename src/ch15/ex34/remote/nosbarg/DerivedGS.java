package ch.ex34.remote.nosbarg;

import ch.ex34.remote.Base;
import ch.ex34.remote.Derived;

/**
 * Created by V1 on 21.03.2017.
 */
public class DerivedGS extends GenericSetter<Base>  {
    public void set(Derived arg) {
        System.out.println("DerivedGS.set:"+arg.getClass().getSimpleName());
    }
}
