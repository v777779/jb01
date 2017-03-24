package ch11.ex01.include;


import java.util.ArrayList;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Cargo {

    void checkGenerics() {
        ArrayList<Apple> apples = new ArrayList();
        apples.add(new Gala());  // добавить три яблока
        apples.add(new Fuji());  // добавить три яблока
        apples.add(new Grand());  // добавить три яблока

        System.out.println(this.getClass().getSimpleName()+".base.class");
        try {
            for (Object apple : apples) {
                System.out.println(((Apple) apple).getId());
            }
        } catch (Exception e) {
            System.out.println("Exception > " + e.getMessage());
            System.out.println();
        }


    }
}
