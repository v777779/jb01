package ch21.ex35.exercise.model;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Server implements Runnable, Comparable<Server> {
    private static int counter = 0;
    private final int id = counter++;
    private int customersServed = 0;
    private CustomerLine customers;
    private boolean servingCustomerLine = true;

    public Server(CustomerLine customers) {
        this.customers = customers;
    }

    public synchronized void setFree() {  // переключиться на другую работу
        customersServed = 0;
        servingCustomerLine = false;
    }

    public synchronized void setBusy() {
        assert !servingCustomerLine : "already serving: " + this; // выдать сообщение
        servingCustomerLine = true;
        notifyAll();  // выдать данному объекту
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Customer customer = customers.take(); // взять клиента из очереди
                TimeUnit.MILLISECONDS.sleep(customer.getServiceTime()); // final поэтому синхронизации не требуется
                synchronized (this) {               // синхронизировано для wait()
                    customersServed++;
                    while (!servingCustomerLine) {  // меняется в другом sync методе
                        wait();                     // заблокировать данный объект
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(this+ " interrupted");
        }
        System.out.println(this+" terminating");
    }

    @Override  // если не сделать Comparable то второй элемент не добавить выдаст Exception
    public synchronized int compareTo(Server o) {
        return customersServed < o.customersServed ? -1 :
                (customersServed > o.customersServed ? 1 : 0);
    }

    public String shortString() {
        return "T" + id;
    }

    @Override
    public String toString() {
        return "Server " + id;
    }


}
