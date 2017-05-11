package ch21.ex36.exercise.restaurant;

import java.util.*;
import java.util.concurrent.*;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Restaurant implements Runnable {
    private final int MAX_PLACES = 5;

    private List<WaitPerson> waitPersons = new ArrayList<>();
    private List<Chef> chefs = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();
    private BlockingQueue<Integer> places = new LinkedBlockingQueue<>();
    public BlockingQueue<OrderTicket> orders = new LinkedBlockingQueue<>();

    private ExecutorService exec = Executors.newCachedThreadPool(); // локальный приостановщик задач
    private static Random rnd = new Random();


    public Restaurant(ExecutorService exec, int nWaitPersons, int nChefs, int nTables) {
        this.exec = exec;
        for (int i = 0; i < nWaitPersons; i++) {
            WaitPerson waitPerson = new WaitPerson(this);
            waitPersons.add(waitPerson);
            exec.execute(waitPerson);
        }

        for (int i = 0; i < nChefs; i++) {
            Chef chef = new Chef(this);
            chefs.add(chef);
            exec.execute(chef);
        }

        List<WaitPerson> list = new LinkedList<>(waitPersons);
        Collections.shuffle(list);
        for (int i = 0; i < nTables; i++) {
            Table table = new Table(this, list.get(i));
            tables.add(table);
            exec.execute(table); // запустили стол
        }
// места
        List<Integer> listPlaces = new ArrayList<>();

        for (int i = 0; i < nTables * MAX_PLACES; i++) {
            listPlaces.add(i);
        }
        Collections.shuffle(listPlaces);
        places = new LinkedBlockingQueue<>(listPlaces);
        System.out.println("Restaurant: number of places:" + places.size());
    }

    public int takePlace() throws InterruptedException {
        return places.take();
    }

    public void putPlace(int place) throws InterruptedException {
        places.put(place); // очередь синхронная поэтому должно работать
    }


    private void placeNewCustomer() throws InterruptedException {
        int place = takePlace();                        // взять место  здесь решается вопрос по ожиданию
        Table table = tables.get(place / MAX_PLACES);   // стол по номеру места  переполнение исключено
        Customer customer = new Customer(table, place); // назначить ему клиента
        exec.execute(customer);

        synchronized (table) {
            table.customers.add(customer);
            System.out.println("Restaurant  :" + table + " new:" + customer + " all:" + table.customers.size());
            table.notify(); // выдергиваем стол если что
        }
    }

    @Override
    public void run() {
        try {
            int count = 0;
            while (!Thread.interrupted()) {
                placeNewCustomer(); // пришел клиент, посадили за столик
                TimeUnit.MILLISECONDS.sleep(rnd.nextInt(500) + 10);
            }
        } catch (InterruptedException e) {
            System.out.println("Restaurant interrupted");
        }
        System.out.println("Restaurant closing...");
        exec.shutdownNow(); // не запустит новых задач

        while (!exec.isTerminated()) {
        }
        System.out.println("Restaurant closed");
    }
}
