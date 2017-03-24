package ch.ex34.remote.nosbarg;

/**
 * Created by V1 on 21.03.2017.
 */
public class GenericSetter<T>{

    public void set(T arg) {
        System.out.println("GenericSetter.set:"+arg.getClass().getSimpleName());
    }
}
