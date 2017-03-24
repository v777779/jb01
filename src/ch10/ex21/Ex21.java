package ch10.ex21;

import ch10.ex21.access.Ball;
import ch10.ex21.access.IBall;
import ch10.ex21.local.ClassRoom;
import ch10.ex21.local.IClassInterface;
import ch10.ex21.local.ITest;

/**
 * Created by V1 on 16-Feb-17.
 */
public class Ex21 {
    public static void main(String[] args) {
        System.out.println("\nNested Class Inside Interface Check\n");

        System.out.println("===== Classroom ====  ");
        ClassRoom c1 = new ClassRoom();
        System.out.print("ClassRoom. constructor to class > ");
        c1.show();

        System.out.println("===== Classroom2 ====  ");
        IClassInterface c2 = new ClassRoom();
        System.out.print("ClassRoom. constructor to interface > ");
        c2.howdo();


        System.out.println("===== Test ====  ");
        IClassInterface.Test t = new ClassRoom().getTest("GreenHouse");  // constructor to class
        System.out.print("Test.instance method to class > ");
        t.show();

        System.out.println("===== Test2 ====  ");
        IClassInterface t1 = new ClassRoom().getTest("WhiteHall");  // constructor to class
        System.out.print("Test.instance method to interface > ");
        t1.howdo();

        System.out.println("===== Test4 ====  ");
        IClassInterface.Test t2 = new IClassInterface.Test("GreenLake");  // constructor to class
        System.out.print("Test.constructor to class > ");
        t2.show();

        System.out.println("===== Test6 ====  ");
        IClassInterface t4 = new IClassInterface.Test("BlueSky");  // constructor to interface
        System.out.print("Test.constructor to interface > ");
        t4.howdo();

        System.out.println("===== Test8 ====  ");
        IClassInterface t6 = IClassInterface.getTest("YellowBunch");  // static method to interface
        System.out.print("Test.static method to interface > ");
        t6.howdo();


        System.out.println("\nNested Class Inside Interface with Nested Interface Check\n");
        System.out.println("===== Test ====  ");
        IClassInterface.Test2 test = new ClassRoom().getTest();  // instance method to class
        System.out.print("Test.instance method to class > ");
        test.show();

        System.out.println("===== Test ====  ");
        ITest test1 = new ClassRoom().getTest();  // instance method to class
        System.out.print("Test.instance method to interface > ");
        test1.howdo();

        System.out.println("===== Test2 ====  ");
        IClassInterface.Test2 test2 = new IClassInterface.Test2();  // constructor to class
        System.out.print("Test2.constructor to class > ");
        test2.show();

        System.out.println("===== Test4 ====  ");
        ITest test4 = new IClassInterface.Test2();                  // constructor to interface
        System.out.print("Test2.constructor to interface > ");
        test4.howdo();

        System.out.println("===== Test6 ====  ");
        ITest test6 = IClassInterface.getTest();                   // interface static method to interface
        System.out.print("Test2.interface static method to interface > ");
        test6.howdo();

        System.out.println("===== Test8 ====  ");
        ITest test8 = IClassInterface.Test2.getTest();              // nested class static method to interface
        System.out.print("Test2.nested class static method to interface > ");
        test8.howdo();

        System.out.println("===== Test10 ====  ");
        ITest test10 = new IClassInterface.Test2().getInst();       // constructor to method to interface
        System.out.print("Test2.static constructor to method to interface > ");
        test10.howdo();
        System.out.println("\nExercise 21 Nested Class Inside Interface Check\n");

        Ball ball = new Ball("Leather");
        IBall.BallColor bc = new IBall.BallColor("BlueRed");
        System.out.println("Ball."+ball.getName()+"."+bc.getColor());
        ball.initBall();
        ball.playBall();
        System.out.println(ball);  // внутри свой экземпляр



    }
}
