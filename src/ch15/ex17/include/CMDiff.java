package ch.ex17.include;

import ch.ex17.local.Sets;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by V1 on 16.03.2017.
 */
public class CMDiff {
    static Set<String> methodSet(Class<?> type) {   // вернуть список методов
        Set<String> tset = new TreeSet<>();
        for (Method method : type.getMethods()) {
            tset.add(method.getName());
        }
        return tset;
    }

    static void interfaces(Class<?> type) {      // вывести список методов
        System.out.println("Interfaces in "+type.getSimpleName()+": ");
        List<String> list = new ArrayList<>();
        for (Class<?> aClass : type.getInterfaces()) {
            list.add(aClass.getSimpleName());
        }
        System.out.println(list);

    }

    static Set<String> tsetObject = methodSet(Object.class);
    static {
        tsetObject.add("clone");  // карта методов класса Object
    }
    static void difference(Class<?> superset, Class<?> subset) {
        System.out.println(superset.getSimpleName()+" extends "+subset.getSimpleName()+
        ", adds: ");

        Set<String> comp = Sets.difference(methodSet(superset),methodSet(subset));

        comp.removeAll(tsetObject); // убрать методы Object
        System.out.println(comp);
        interfaces(superset);
    }




}
