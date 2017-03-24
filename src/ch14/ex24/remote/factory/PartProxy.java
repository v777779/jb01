package ch14.ex24.remote.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by V1 on 13-Mar-17.
 */
public class PartProxy implements InvocationHandler{
private String nullName = "NULL";
private IPart proxiObj = new NullPart(); // создаем NullPart объект один

    private class NullPart implements IPart, Null {

        @Override
        public String getModel() {
            return "Model:NULL";
        }

        @Override
        public String toString() {
            return nullName;
        }
    }

    public PartProxy(Class <?extends IPart> type) {  // конструктор класса Proxy
        this.nullName = type.getSimpleName()+".NULL";  // имя объекта
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxiObj,args);  // вызываем оригинальный метод
    }

}
