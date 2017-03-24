package ch14.ex25.integra;

import ch14.ex25.integra.pkg.*;
import lib.utils.Range;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    private static Object getHidden(Object c, String met) {
        try {
            Method m = c.getClass().getDeclaredMethod(met);
            m.setAccessible(true);
            return (m.invoke(c)); // если аргументов нет, можно без них
        } catch (Exception e) {
            System.out.println("catch:NoMethod");

        }
        return null;
    }
    private static void getHiddenField(Object c, String f, String type) {
        try {
            Field ff = c.getClass().getDeclaredField(f);
            ff.setAccessible(true);
            String fa;
            String fs;
            if (type.equals("int")) {
                fa = "<"+f + ":" + ff.getInt(c)+">  ";
                fs = (String)getHidden(c,"getFields");
                System.out.printf("%-22s  :  %s\n",fa,fs);
                ff.setInt(c,5);
                fa =("<"+f + ":" + ff.getInt(c)+">  ");
                fs = (String)getHidden(c,"getFields"); // честная проверка
                System.out.printf("%-22s  :  %s\n",fa,fs);

            }
            if (type.equals("String")) {
                fa = ("<" + f + ":" + ff.get(c)+">  ");
                fs = (String)getHidden(c,"getFields");
                System.out.printf("%-22s  :  %s\n",fa,fs);
                ff.set(c,"NewSTR:"+ Range.getInt(100));
                fa = ("<" + f + ":" + ff.get(c)+">  ");
                fs = (String)getHidden(c,"getFields"); // честная проверка
                System.out.printf("%-22s  :  %s\n",fa,fs);
            }
        } catch (Exception e) {
            System.out.println("catch:NoMethod");
        }
    }

    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nInterface Isolation Field Check\n");
        A a = HiddenC.makeA();
//methods
        getHidden(a, "w");
        System.out.println(getHidden(a, "getFields"));
//fields
        getHiddenField(a,"i","int");
        getHiddenField(a,"s","String");
        getHiddenField(a,"s2","String");
        System.out.println("------------------------------");
        A aa = HiddenC.makeAnonimA();
//methods
        getHidden(aa, "w");
        System.out.println(getHidden(aa, "getFields"));
//fields
        getHiddenField(aa,"j","int");
        getHiddenField(aa,"t","String");
        getHiddenField(aa,"t2","String");

    }
}
