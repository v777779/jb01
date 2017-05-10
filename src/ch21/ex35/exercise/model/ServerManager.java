package ch21.ex35.exercise.model;

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
public class ServerManager implements Runnable {
    private ExecutorService exec;
    private CustomerLine customers;
    private PriorityQueue<Server> busyServers = new PriorityQueue<>(); // Server must be Comparable<Server>
    private Queue<Server> freeServers = new LinkedList<>(); // обычный список
    private int adjustmentPeriod;
    private static Random rnd = new Random();
    private final int maxServers;

    public ServerManager(ExecutorService exec, CustomerLine customers, int maxServers, int adjustmentPeriod) {
        this.exec = exec;
        this.customers = customers;
        this.maxServers = maxServers;
        this.adjustmentPeriod = adjustmentPeriod;
//start new server
        Server server = new Server(customers); // в начале создается один кассир
        exec.execute(server);
        busyServers.add(server); // в очередь работающих серверов

        for (int i = 0; i < maxServers-1 ; i++) {
            server = new Server(customers); // в начале создается один кассир
            server.setFree();               // сразу освободить
            exec.execute(server);
            freeServers.add(server);        // в очередь свободных серверов
        }

    }

    private void reassignOneTeller() {
        Server server = busyServers.poll();  // изъять объект из очереди по приоритету
        server.setFree();               // переключить на другую работу
        freeServers.offer(server);  // добавить в очередь другой работы
    }

    public void adjustServerNumber() {                          // контроль числа кассиров
        double load = (double) customers.size() * 100.0 / (2 * maxServers);
        int busy = busyServers.size();
        int free = freeServers.size();
        String s = ("Load " + load + "%" + " servers:" + (busy+free)+"("+busy+":"+free+")");
        if (load > 120.0) {
            s+= " *** overload ***";
        }
        System.out.println(s);
        if (customers.size() / busyServers.size() > 2) {         // число клиентов больше работающих кассиров
            if (freeServers.size() > 0) {                // если есть неработающие
                Server server = freeServers.remove();    // изъять из списка
                server.setBusy();                         // поставить его на обслуживание
                busyServers.offer(server);                       // добавить в очередь работающих
                return;
            }

// сервера уже все созданы
//            if (busyServers.size() < maxServers) {  // число серверов ограничено
//                Server server = new Server(customers);  // создать одного
//                exec.execute(server);                   // запустить его задачу
//                busyServers.offer(server);           // add() { offer() }
//                return;
//            }
        }
// убрать кассира кроме последнего
        if (busyServers.size() > 1 && customers.size() / busyServers.size() < 2) {
            reassignOneTeller();
        }

        if (customers.size() == 0) { // клиентов нет
            while (busyServers.size() > 1) {  // выбрать всех кроме одного
                reassignOneTeller();
            }
        }

    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(adjustmentPeriod); // период отработки
                adjustServerNumber(); // отработать число кассиров
                System.out.print(customers + " { ");
                for (Server server : busyServers) {
                    System.out.print(server.shortString() + " ");
                }
                System.out.println(" }");
            }
        } catch (InterruptedException e) {
            System.out.println(this + " interrupted");
        }
        System.out.println(this + " terminating");
    }

    @Override
    public String toString() {
        return "ServerManager ";
    }
}
