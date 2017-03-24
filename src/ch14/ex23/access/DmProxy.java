package ch14.ex23.access;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by V1 on 12-Mar-17.
 */
public class DmProxy implements InvocationHandler {
    private Object proxyObj;
    private static int loopcount = 0;

    public DmProxy(Object proxyObj) {
        this.proxyObj = proxyObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxy:");
        if(loopcount++ > 10){
            return null;
        }
        System.out.println(loopcount+" "+super.toString()); // super.toString() отработает нормально
        System.out.println(proxy.toString());               // proxy.toString() вызывает stackOverflow

        long start = System.nanoTime();
        Object retObj = method.invoke(proxyObj, args);
        System.out.println("time:" + (System.nanoTime() - start));

        return retObj;  // выполнить оригинальный метод
    }

}
