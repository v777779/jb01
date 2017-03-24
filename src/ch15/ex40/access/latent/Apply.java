package ch.ex40.access.latent;

import java.lang.reflect.Method;

/**
 * Created by V1 on 22.03.2017.
 */
public class Apply {
    public static <T, S extends Iterable<? extends T>> void apply(S list, Method f, Object...args) {
        try {
            for (T t : list) {      // итератор, так как создали ArrayList
                f.invoke(t,args);   // вызвать метод с набором
            }                       //аргументов для данного объекта
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
