package ch14.ex24.include;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/**
 * Created by V1 on 12-Mar-17.
 */
public class NullRobotProxy implements InvocationHandler {
    private String nullName;                // имя для пустого объекта робот
    private Robot proxiObj = new NRobot();  // встроенный класс

    private class NRobot implements Null, Robot { // оба интерфейса проприетарные
        public String name() {
            return nullName;
        }
        public String model() {
            return nullName;
        }
        public List<Operate> operate() {
            return Collections.emptyList();  // возвращает пустой список
        }
    } // class NRobot finished

    public NullRobotProxy(Class <? extends  Robot> type) {  // работает с любыми типами производными от Robot
        nullName = type.getSimpleName()+" NULLRobot";       // производный объект NULL от имени класса объекта
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxiObj,args);  // вызвать оригинальный метод

    }
}
