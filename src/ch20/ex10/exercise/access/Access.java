package ch20.ex10.exercise.access;

import lib.units.atunit.TestProperty;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 18-Feb-17.
 */
public class Access {
    private StringBuilder sb = new StringBuilder();
    private long count = 0;
    private Class c;
    private String cName;

    public Access(String cName) {
        this.cName = cName;
    }

    @TestProperty
    protected StringBuilder getSB() {
        return sb;
    }
    @TestProperty
    protected long  getCount() {
        return count;
    }
    @TestProperty
    protected Class getC() {
        return c;
    }



    public String printInfo(Class c) {
        count++;
        return String.format(count + ":SimpleName:%-25s interface:%-25s\n", c.getSimpleName(), c.isInterface());
    }

    public void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise   Check\n");

        c = null; // объект типа Class
        try {
            c = Class.forName(cName); // получить ссылку на класс
        } catch (Exception e) {
            System.out.println("Class not found");
           throw new RuntimeException(e);  // вылетает если не найдено
        }
         sb.append(printInfo(c));
        for (Class aClass : c.getInterfaces()) {
            sb.append(printInfo(aClass));
        }
        System.out.println(sb.toString());
    }
}
