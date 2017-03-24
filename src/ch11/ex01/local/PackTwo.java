package ch11.ex01.local;

import java.util.ArrayList;

/**
 * Created by V1 on 18-Feb-17.
 */
public class PackTwo {
//    @SuppressWarnings("unchecked")   // отключение предупреждений
    void checkCollection() {
        ArrayList<Apple> apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());  // добавить три яблока
        }
//        apples.add(new Orange());
        System.out.println(this.getClass().getSimpleName()+" collection check");
        for (Object apple : apples) {
            System.out.println(((Apple)apple).getId());
        }


    }
}
