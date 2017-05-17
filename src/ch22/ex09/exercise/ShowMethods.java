package ch22.ex09.exercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 10-Mar-17.
 */
public class ShowMethods {
    private static String usage = "usage:\n" +
            "ShowMethods qualified.class.name\n" +
            "To show all methods in class or:\n" +
            "ShowMethods qualified.class.name word\n" +
            "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\."); // слова до точки

    public static void check(String[] args) {
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();

            if (args.length == 1) {
                for (Method method : methods) {
                    System.out.println(p.matcher(method.toString()).replaceAll("")); // убрать все <word.>
                }
                for (Constructor ctor : ctors) {
                    System.out.println(p.matcher(ctor.toString()).replaceAll("")); // убрать все <word.>
                }
                lines = methods.length+ctors.length; // число строк
            } else {
                for (Method method : methods) {
                    if(method.toString().indexOf(args[1])!= -1) {
                        System.out.println(p.matcher(method.toString()).replaceAll("")); // убрать все <word.>
                        lines++;
                    }
                }
                for (Constructor ctor : ctors) {
                    if(ctor.toString().indexOf(args[1])!= -1) {
                        System.out.println(p.matcher(ctor.toString()).replaceAll("")); // убрать все <word.>
                        lines++;
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("NO such class: " + e);
        }
    }

    public static void main(String[] args) {

        if (args.length < 1) {
            args = new String[] { "ch22.ex09.exercise.Exercise"  };
        }

        System.out.println("Main  Methods:");
        System.out.println("==============");
        check(args);

        System.out.println("\nJFrame  Methods:");
        System.out.println("==================");

        args = new String[] { "ch22.ex09.codeb.ShowAddListeners"  };
        check(args);

    }

}
