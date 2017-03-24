package ch14.ex01.integra;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static int count = 0;
    public static void printInfo(Class c) {
        count++;
        System.out.printf(count+":Имя класса:%-25s interface:%-25s\n",c.getName(),c.isInterface());
        System.out.printf(count+":simpleName:%-25s  fullName:%-25s\n",c.getSimpleName(),c.getCanonicalName());
        System.out.println();
    }
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nClass Object Check\n");
        Class c = null; // объект типа Class
        try {
            c = Class.forName("ch14.ex01.integra.FancyToy"); // получить ссылку на класс
        } catch (Exception e) {
        }
        printInfo(c);
        for (Class aClass : c.getInterfaces()) {
            printInfo(aClass);
        }
        Class up = c.getSuperclass();
        Object o = null; //
        try {
            o = up.newInstance(); //
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        printInfo(o.getClass()); // получить объект Class из объекта



    }
}
