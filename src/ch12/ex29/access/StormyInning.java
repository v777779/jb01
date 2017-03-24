package ch12.ex29.access;

import java.util.Random;

/**
 * Created by V1 on 03-Mar-17.
 */
public class StormyInning extends Inning implements Storm {
    private Random rnd = new Random();


    public StormyInning() throws BaseBallEx, RainedOut {  // базовая версия и дополнительная
        super();// так как super() первый элемент, то некуда вставить try{}
        if (rnd.nextBoolean()) {
            throw new RainedOut();
        }
    }

    @Override
    public void walk() { //throws PopFoul { //не сработает, нельзя возбуждать исключения в потомке
                                       // если их нет в базовой версии
    }

    public StormyInning(String s) throws BaseBallEx { // базовая и дополнительная
    }

    @Override
    public void rainHard() throws RainedOut {           // базовые версии
        if (rnd.nextBoolean()) {
            throw new RainedOut();
        }
    }

    @Override
    public void atBat() throws RainedOut, Strike, PopFoul, Light {  // базовые версии и потомки
        switch (rnd.nextInt(5)) {   // ВНИМАНИЕ. нормально компилируется если RuntimeException
            case 0: throw new Strike();
            case 1: throw new PopFoul();
            case 2: throw new Light();
            default: throw new RainedOut(".atBat.");
        }
    }

    // единственный рабочий вариант, когда есть два метода с разными исключениями
    public void event() {
        try {
            super.event();
        } catch (BaseBallEx e) {
            System.out.println("StormInning:" + e.getMessage());
        }
    }

}
