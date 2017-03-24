package ch15.ex41.local;

import lib.utils.SimpleQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nCollection add() Check Check\n");

        System.out.println("Check add() for ArrayList:");
        List<Contract> clist = new ArrayList<>();
        Fill.fill(clist, Contract.class,5); // базовым классом
        Fill.fill(clist, TitleTransfer.class,5);  // потомком
        System.out.println("clist:"+clist);

        System.out.println("\nCheck add() for SimpleQueue:");
        SimpleQueue<Contract> cqueue = new SimpleQueue<>();
//        Fill2.fill(cqueue, Contract.class,5); // не пропускает, SimpleQueue не Collection
        System.out.println("cqueue:"+cqueue);

        System.out.println("\nCheck add() for Queue:");
        Queue<Contract> queue = new LinkedList<>();
        Fill.fill(queue, Contract.class,5); // пропускает, т.к. Queue >> Collection
        System.out.println("queue:"+queue);






    }
}
