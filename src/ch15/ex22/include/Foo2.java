package ch15.ex22.include;

import lib.utils.IFactory;

/**
 * Created by V1 on 17.03.2017.
 */
public class Foo2<T> {
    private T x;

    public <F extends IFactory<T>> Foo2(F object ) {  // в конструктор передается объект который поддерживает IFactory2
        x = object.create();
    }

    public T getX() {
        return x;
    }
}
