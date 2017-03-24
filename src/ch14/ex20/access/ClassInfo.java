package ch14.ex20.access;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by V1 on 09-Mar-17.
 */
public class ClassInfo extends HashMap<Class<?>, Integer> {
    private Class<?> c;

    public ClassInfo(Class<?> c) {  // назначается базовый класс
        this.c = c;
    }

    private static void getCons(Class<?> c) {
        Constructor<?>[] cons = c.getConstructors();
        System.out.println("Constructors:");
        for (Constructor con : cons) {
            System.out.print(con.toString().replaceAll("\\w+\\.", "") + " ");
//            Class[] params = con.getParameterTypes();
//            System.out.print("Parameters:" + params.length + " ");
//            for (Class param : params) {
//                System.out.print(param.getName() + " # ");
//            }
            System.out.println();
        }
    }

    private static void getMets(Class<?> c) {
        Method[] mets = c.getMethods();
        System.out.println("Methods:");
        for (Method met : mets) {
            System.out.print(met.toString().replaceAll("\\w+\\.", "") + " ");
//            Class[] params = met.getParameterTypes();
//            System.out.print("Parameters:" + params.length + " ");
//            for (Class param : params) {
//                System.out.print(param.getName() + " # ");
//            }
            System.out.println();
        }
    }

    private static void getFields(Class<?> c) {
        Field[] fields = c.getFields();
        System.out.println("Fields:");
        for (Field field : fields) {
            System.out.println(field.toString().replaceAll("\\w+\\.", ""));
        }


    }

    private void printInfo(Class<?> c) {
        System.out.println(c.getSimpleName());
        getCons(c);
        getMets(c);
        getFields(c);
    }

    private void printInfoI(Class<?> c) {
        System.out.print(c.getSimpleName() + " : ");
    }

    private void getInfoI(Class<?> c) {
        printInfoI(c);
        for (Class<?> iClass : c.getInterfaces()) {
            getInfoI(iClass);
        }
        Class<?> superClass = c.getSuperclass();
        if (superClass == null) {
            return;
        }
        getInfoI(superClass);
    }

    public void getInfo() {
        getInfo(c);
    }

    public void getInfo(Class<?> c) {
        printInfo(c);
        System.out.println("Interfaces:");
        for (Class<?> iClass : c.getInterfaces()) {
            getInfoI(iClass);
            System.out.println();
        }
        Class<?> superClass = c.getSuperclass();
        if (superClass == null) {
            return;
        }
        System.out.println();
        getInfo(superClass);
    }
}
