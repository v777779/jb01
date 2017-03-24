package ch.ex28.include;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Include {

    public static void app() {
        Egg bigEgg = new BigEgg();  // создание
        bigEgg.show();
        bigEgg.setY(null);  // смена Yolk
        bigEgg.show();


    }

}
