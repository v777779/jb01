package ch19.ex02.codea;

import lib.system.OSExecute;

import java.lang.reflect.Method;
import java.util.Set;
import java.util.TreeSet;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class Reflection {
    public static Set<String> analyze(Class<?> enumClass) {
        Set<String>  tSet = new TreeSet<>();

        System.out.println("------ Analyzing "+enumClass+" -------------");
        System.out.println("Interfaces:");
        for (Class<?> aClass : enumClass.getInterfaces()) {
            System.out.println(aClass);
        }

        System.out.println("Base Class:"+enumClass.getSuperclass());

        System.out.println("Methods   :");
        for (Method method : enumClass.getMethods()) {
            tSet.add(method.getName());
        }
        System.out.println(tSet);
        return  tSet;
    }

    public static void check() {
        Set<String> exploreMethods = analyze( Explore.class);
        Set<String> enumMethods = analyze( Enum.class);
        System.out.println("Explore.containsAll(Enum)? :" + exploreMethods.contains(enumMethods));
        System.out.println("Explore.removeAll(Enum)    :");
        exploreMethods.removeAll(enumMethods);
        System.out.println("Explore methods            :"+exploreMethods);
        OSExecute.command("javap ");


    }


}
