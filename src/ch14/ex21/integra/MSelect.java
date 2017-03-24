package ch14.ex21.integra;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by V1 on 12-Mar-17.
 */
public class MSelect implements InvocationHandler{
    private Object proxyObj;
    public MSelect(Object proxyObj) {
        this.proxyObj = proxyObj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
// промежуточная работа Proxy
        if (method.getName().matches("inter\\w+")) {
            System.out.print("[Proxy] ");
//            System.out.print("Interested Method Found]");
        }
        return method.invoke(proxyObj,args);  // выполнить оригинальный метод
    }

}
