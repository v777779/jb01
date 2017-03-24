package ch.ex34.remote.ordarg;

import ch.ex34.remote.Base;

/**
 * Created by V1 on 21.03.2017.
 */
public class OrdinarySetter {
    public void set(Base obj) {
        System.out.println("OrdinarySetter.set:"+obj.getClass().getSimpleName());
    }
}
