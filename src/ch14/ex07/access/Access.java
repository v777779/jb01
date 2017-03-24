package ch14.ex07.access;

import ch14.ex07.access.shop.Candy;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static final String[] C_NAMES = {"Candy", "Cookie", "Gum"};

    public static void app(String[] args) {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 7 Class Check\n");
        if (args == null || args.length == 0) {
            System.out.println("Usage:java ch14.ex07.Ex7 Candy or Cookie,Gum");
            return;
        }
//        if (args.length == 0) {
//            args = new String[]{"Gum", "Cookie"};
//        }
        Class c = null;
        String pkg = Candy.class.getPackage().toString().replaceFirst("p\\w+\\s", "");
        for (String arg : args) {
            for (int i = 0; i < C_NAMES.length; i++) {
                String regex = "(?i)(" +C_NAMES[i].substring(0, 2).toLowerCase() + "\\w+)";

                if (arg.matches(regex)) {
                    try {
                        c = Class.forName( pkg+"."+C_NAMES[i]);
                        Object cc = c.newInstance();
                        System.out.println("created:" + c.getSimpleName());
                    } catch (Exception e) {
                        System.out.println("Can't create Instance");
                    }
                }

            }
        }

//                System.out.println("forName:"+pkg+"."+C_NAMES[i]);
//                System.out.println("pwd:"+System.getProperty("user.dir"));
//                System.out.println(arg+" "+regex);
//                System.out.println(arg.matches(regex));
//        try {
//            Class c = Candy.class;
//            Object cc = c.newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }



    }
}
