package ch.ex23.access;

/**
 * Created by V1 on 17.03.2017.
 */
public class Foo2 <T,V> {
    private T x;

    public <F extends IFactory2<T,V>> Foo2(F object,V v ) {  // в конструктор передается объект который поддерживает IFactory2
        x = object.create(v);
    }

    public T getX() {
        return x;
    }
}
