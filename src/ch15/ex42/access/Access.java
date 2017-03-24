package ch15.ex42.access;

import ch15.ex42.access.func.Collector;
import ch15.ex42.access.func.FnClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 42 Check\n");

        System.out.println("Ball Operations:");
        System.out.println("----------------");
        List<Ball> bList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            bList.add(new Ball(new Random().nextInt(100)));
        }
        System.out.println("balls   :"+bList);

        Ball bRes = FnClass.reduce(bList,new FnClass.BallAdder());
        System.out.println("Ball Add:"+bRes);

        List<Ball> bRList;
        bRList = FnClass.filter(bList,new FnClass.GreaterThan<>(new Ball(45)));
        System.out.println("Ball GT :"+bRList);

        bRList = FnClass.transform(bList,new FnClass.IncBall());
        System.out.println("Ball Inc:"+bRList);


        bRes = FnClass.reduce(bList,new FnClass.BallSubtracter());
        System.out.println("Ball Sub:"+bRes);

        Collector<Ball> bc;
        bc =  FnClass.forEach( bList, new FnClass.MultBallCollector());
        System.out.println("MultBall:"+bc.result());

        System.out.println("\nMill Operations:");
        System.out.println("----------------");

        List<Mill> mList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mList.add(new Mill(new Random().nextInt(100)));
        }
        System.out.println("mills   :"+mList);

        Mill mRes = FnClass.reduce(mList,new FnClass.MillAdder());
        System.out.println("Mill Add:"+mRes);

        List<Mill> mRList;
        mRList = FnClass.filter(mList,new FnClass.GreaterThan<>(new Mill(45)));
        System.out.println("Mill GT :"+mRList);

        mRes = FnClass.reduce(mList,new FnClass.MillSubtracter());
        System.out.println("Mill Sub:"+mRes);

        Collector<Mill> mc;
        mc =  FnClass.forEach( mList, new FnClass.MultMillCollector());
        System.out.println("MultMill:"+mc.result());


    }
}
