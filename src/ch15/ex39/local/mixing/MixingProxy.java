package ch15.ex39.local.mixing;

import lib.tuples.TwoTuple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by V1 on 22.03.2017.
 */
public class MixingProxy implements InvocationHandler {
    Map<String, Object> map;

    public MixingProxy(TwoTuple<Object, Class<?>>... pairs) {  // input array of TwoTuple  конструктор
        map = new HashMap<>(); // создат карту
        for (TwoTuple<Object, Class<?>> pair : pairs) {
            for (Method method : pair.second.getMethods()) { // по второму аргументы вытаскиваем методы
                String name = method.getName(); // вытащили имя метода
                if (!map.containsKey(name)) {  // если в базе нет такого метода
                    map.put(name, pair.first); // заполняем базу методов ключ имя метода, значение объект
                }
            }
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name  = method.getName(); // вытащили строку метода
        Object delegated = map.get(name); // вытащили объект с реализацией метода

        return method.invoke(delegated, args);  // идет подмена proxy
    }

    public static Object newInstance(TwoTuple... pairs) {   // массив аргументов  TwoTuple()
        Class[] interfaces = new Class[pairs.length];       // создали массив Class[]
        for (int i = 0; i < interfaces.length; i++) {
            interfaces[i] = (Class)pairs[i].second;         // вытаскивается класс объекта
        }

        ClassLoader cload = pairs[0].first.getClass().getClassLoader(); // загрузчик класса
        return Proxy.newProxyInstance(
                cload,
                interfaces,
                new MixingProxy(pairs)
        );
    }


}
