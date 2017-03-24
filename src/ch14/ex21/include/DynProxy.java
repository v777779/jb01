package ch14.ex21.include;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by V1 on 11-Mar-17.
 */
public class DynProxy implements InvocationHandler {
    private Object proxiObj;

    public DynProxy(Object proxiObj) {
        this.proxiObj = proxiObj;
    }

    @Override
    public Object invoke(Object proxi, Method met, Object[] args) throws Throwable {
        System.out.println(" proxy : " + proxi.getClass().getSimpleName());
        System.out.println(" method: " + met.getName());
        System.out.println(" args[]: " + ((args ==null)?args:args.length));
//        if (args != null) {
//            for (Object arg : args) {
//                System.out.println(" "+arg);
//            }
//        }

        return met.invoke(proxiObj, args);
    }


}
