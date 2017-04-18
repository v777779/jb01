package ch19.ex01.codea;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class EnumClass {

    public static void check() {
        for (Shrubbery shrubbery : Shrubbery.values()) {
            System.out.println(shrubbery + " ordinal:" + shrubbery.ordinal());
            System.out.println("cmp to CRAWLING:" +
                    shrubbery.compareTo(Shrubbery.CRAWLING) + " " +
                    shrubbery.equals(Shrubbery.CRAWLING) + " " +
                    (shrubbery == Shrubbery.CRAWLING));
            System.out.println("declaring class:"+shrubbery.getDeclaringClass());
            System.out.println("name           :"+shrubbery.name());
            System.out.println("---------------------------------");
        }
    }
}
