package ch.ex41.include;


import lib.utils.SimpleQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nLatent and Sequence Adapter Interfaces Check\n");

        List<Contract> clist = new ArrayList<>();
        Fill2.fill(new AdapterC<>(clist),Contract.class,10); // втаскиваем коллекцию через адаптер, который даст метод
        System.out.println("clist :"+clist);

        SimpleQueue<Contract> cqueue = new SimpleQueue<>();
        Fill2.fill(new AdapterQ<>(cqueue),Contract.class,10); // втаскиваем коллекцию через адаптер, который даст метод
        System.out.print("cqueue:[");
        for (Contract contract : cqueue) {
            System.out.print(contract+" ");
        }
        System.out.println("]");

        ArrayList<Contract> dlist = new ArrayList<>();
        Fill2.fill(Adapter.getAutoAdapterC(dlist), Contract.class,10);
        System.out.println("dlist :"+dlist);

        SimpleQueueAdd<Contract> dqueue = new SimpleQueueAdd<>();  // интересная версия очередь с встроенным адаптером
        Fill2.fill(dqueue,Contract.class,10); // втаскиваем коллекцию через адаптер, который даст метод
        System.out.println("dqueue:"+dqueue);



    }
}
