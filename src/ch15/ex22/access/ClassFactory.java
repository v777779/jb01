package ch15.ex22.access;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

/**
 * Created by V1 on 17.03.2017.
 */
public class ClassFactory<T> {
    T x; // экземпляр Generic класса
    Class<T> kind;

    public ClassFactory(Class<T> kind) {
        this.kind = kind; // Class label
//        try {
//            x = kind.newInstance();
//        } catch (Exception e) {
//            System.out.println("Can't create Instance:" + kind.getSimpleName());
//        }
    }

    private boolean check(Parameter p, String name) {
        if (p == null) {
            return false;
        }
        return name.equals(p.getParameterizedType().getTypeName().replaceAll("\\w+\\.", ""));
    }

    public <T,U,V>  T create(U s, V i) {
        try {
            for (Constructor<?> con : kind.getConstructors()) {
                Parameter [] p = con.getParameters();
                if (p.length == 2 && check(p[0], s.getClass().getSimpleName())) {
                    return (T) con.newInstance(s, i);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException("catch: Can't create Instance");  // в любом случае вызываем Exception
        }
        throw new RuntimeException("Constructor not Found");  // в любом случае вызываем Exception
    }

}
