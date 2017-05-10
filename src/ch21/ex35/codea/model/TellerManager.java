package ch21.ex35.codea.model;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TellerManager implements Runnable {
    private ExecutorService exec;
    private CustomerLine customers;
    private PriorityQueue<Teller> workingTellers = new PriorityQueue<>(); // Server must be Comparable<Server>
    private Queue<Teller> tellersDoingOtherThings = new LinkedList<>(); // обычный список
    private int adjustmentPeriod;
    private static Random rnd = new Random();

    public TellerManager(ExecutorService exec, CustomerLine customers, int adjustmentPeriod) {
        this.exec = exec;
        this.customers = customers;
        this.adjustmentPeriod = adjustmentPeriod;
        Teller teller = new Teller(customers); // в начале создается один кассир
        exec.execute(teller);
        workingTellers.add(teller); // в очередь сотрудников
    }

    private void reassignOneTeller() {
        Teller teller = workingTellers.poll();  // изъять объект из очереди по приоритету
        teller.doSomethingElse();               // переключить на другую работу
        tellersDoingOtherThings.offer(teller);  // добавить в очередь другой работы
    }

    public void adjustTellerNumber() {                          // контроль числа кассиров
        if (customers.size() / workingTellers.size() > 2) {         // число клиентов больше работающих кассиров
            if (tellersDoingOtherThings.size() > 0) {                // если есть неработающие
                Teller teller = tellersDoingOtherThings.remove();    // изъять из списка
                teller.serveCustomerLine();                         // поставить его на обслуживание
                workingTellers.offer(teller);                       // добавить в очередь работающих
                return;
            }

            Teller teller = new Teller(customers);  // создать одного
            exec.execute(teller);                   // запустить его задачу
            workingTellers.offer(teller);           // add() { offer() }
            return;
        }
// убрать кассира кроме последнего
        if (workingTellers.size() > 1 && customers.size() / workingTellers.size() < 2) {
            reassignOneTeller();
        }

        if (customers.size() == 0) { // клиентов нет
            while (workingTellers.size() > 1) {  // выбрать всех кроме одного
                reassignOneTeller();
            }
        }

    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(adjustmentPeriod); // период отработки
                adjustTellerNumber(); // отработать число кассиров
                System.out.print(customers+ " { ");
                for (Teller teller : workingTellers) {
                    System.out.print(teller.shortString()+" ");
                }
                System.out.println(" }");
            }
        } catch (InterruptedException e) {
            System.out.println(this+" interrupted");
        }
        System.out.println(this+" terminating");
    }

    @Override
    public String toString() {
        return "ServerManager ";
    }
}
