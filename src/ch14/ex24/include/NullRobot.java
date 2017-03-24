package ch14.ex24.include;

import java.lang.reflect.Proxy;

/**
 * Created by V1 on 12-Mar-17.
 */
public class NullRobot {
    public static Robot getNULL(Class<?extends Robot> type) {  // единственный метод создания объекта
        return (Robot) Proxy.newProxyInstance(
                NullRobot.class.getClassLoader(),
                new Class[] { Null.class,Robot.class},
                new NullRobotProxy(type)
        );
    }
}
