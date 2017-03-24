package ch.ex18;

import ch.ex18.cycle.BFactory;
import ch.ex18.cycle.TFactory;
import ch.ex18.cycle.UFactory;
import ch.ex18.cycle.UserCycle;
import ch.ex18.downstream.FieldMouse;
import ch.ex18.downstream.Mouse;
import ch.ex18.downstream.Rodent;
import ch.ex18.fabric.*;
import ch.ex18.gamer.*;
import ch.ex18.local.A;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Ex18 {
    public static void main(String[] args) {
        System.out.println("\nNested Interface Check\n");
//        A.IBPublic ab = new A.CPublic();  // не прокатывает вне класса A
//        A.CPublic ac = new A.CPublic();   // не прокатывает вне класса  A
          A a = new A();
//        a.getD().f();                     // не работает извне пакета
          a.receiveD(a.getD());             // все прокатило из другого пакета

        System.out.println("\nFabric Pattern Interface Check\n");
        Consumer.getService(new Factory());  // доступ через getService()
        Consumer.getService(new Factory2());// доступ через getService()

        System.out.println();
        Consumer.getService(new Equipment());    // доступ напрямую
        Consumer.getService(new Equipment2());   // напрямую

        System.out.println("\nFabric Pattern Interface Game Check\n");
        PlayGame.playGame(new CheckersFactory());  // вызов через метод фабрика
        PlayGame.playGame(new ChessFactory());
        PlayGame.playGame(new ShooterFactory());
        PlayGame.playGame(new ArcadeFactory());
        PlayGame.playGame(new RPGFactory());
        System.out.println();
        PlayGame.playGame(new Checkers());   // прямой вызов игры
        PlayGame.playGame(new Chess());
        PlayGame.playGame(new Shooter());
        PlayGame.playGame(new Arcade());
        PlayGame.playGame(new RPG());

        System.out.println("\nExercise Downstream Class Check\n");
        Rodent fieldMouse = new FieldMouse();
        Rodent mouse = new Mouse();
        fieldMouse.eat();                       // восходящее преобразование
        mouse.sleep();                          // восходящее преобразование
        ((Mouse)mouse).mouseType();             // нисходящее преобразование
//      ((FieldMouse)mouse).mouseColor();       // не сработает
        ((FieldMouse)fieldMouse).mouseColor();  // нисходящее преобразование

        System.out.println("\nExercise 18 Factory Cycle Interface Check\n");
        UserCycle.buildCycle(new UFactory()); // получить через фабрику и использовать
        UserCycle.buildCycle(new BFactory()); // получить через фабрику и использовать
        UserCycle.buildCycle(new TFactory()); // получить через фабрику и использовать

    }
}
