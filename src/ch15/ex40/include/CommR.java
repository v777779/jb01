package ch.ex40.include;

import java.lang.reflect.Method;

/**
 * Created by V1 on 22.03.2017.
 */
public class CommR {
    public static void perform(Object p) {
        Class<?> pClass = p.getClass();

        try {
            try {

                Method mSpeak = pClass.getMethod("speak");
                mSpeak.invoke(p); // вызов метода

            } catch (NoSuchMethodException e) {
                System.out.println(pClass.getSimpleName()+": can't call speak()");
            }

            try {

                Method mSit = pClass.getMethod("sit");
                mSit.invoke(p); // вызов метода

            } catch (NoSuchMethodException e) {
                System.out.println(pClass.getSimpleName()+": can't call sit()");
            }

        } catch (Exception e) {  // all other exceptions
            throw new RuntimeException(pClass.getSimpleName(),e);  // сообщение и Exception e
        }

    }
}
