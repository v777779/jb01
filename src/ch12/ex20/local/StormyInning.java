package ch12.ex20.local;

/**
 * Created by V1 on 03-Mar-17.
 */
public class StormyInning extends Inning implements Storm {
    public StormyInning() throws BaseBallEx, RainedOut {  // базовая версия и дополнительная
        super();// так как super() первый элемент, то некуда вставить try{}
    }

//    @Override
//    public void walk() throws PopFoul { //не сработает, нельзя возбуждать исключения в потомке
//                                       // если их нет в базовой версии
//    }

    public StormyInning(String s) throws BaseBallEx{ // базовая и дополнительная
    }
    @Override
    public void rainHard() throws RainedOut {           // базовые версии

    }

    @Override
    public void atBat() throws Strike, PopFoul, Light {  // базовые версии и потомки
    }
    // единственный рабочий вариант, когда есть два метода с разными исключениями
    public void event() {
        try {
            super.event();
        } catch (BaseBallEx e) {
            System.out.println("StormInning:"+e.getMessage());
        }
    }

}
