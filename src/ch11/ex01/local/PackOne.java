package ch11.ex01.local;

import java.util.ArrayList;

/**
 * Created by V1 on 18-Feb-17.
 */
public class PackOne {
    @SuppressWarnings("unchecked")   // отключение предупреждений
    void checkCollection() {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());  // добавить три яблока
        }
        apples.add(new Orange());
        System.out.println(this.getClass().getSimpleName()+" collection check");
        try {
            for (Object apple : apples) {
                System.out.println(((Apple) apple).getId());
            }
        } catch (Exception e) {
            System.out.println("Exception > "+e.getMessage());
            System.out.println();
        }


    }
}
