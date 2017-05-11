package ch21.ex36.exercise.restaurant;

import lib.food.Food;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Order {
    private static int counter = 0;
    private final int id = counter++;
    private final Customer customer;
    private final WaitPerson waitPerson;
    private final Food food;

    public Order(Customer customer, WaitPerson waitPerson, Food food) {
        this.customer = customer;
        this.waitPerson = waitPerson;
        this.food = food;
    }

    public Food item() {
        return food;
    }

    public Customer getCustomer() {
        return customer;
    }

    public WaitPerson getWaitPerson() {
        return waitPerson;
    }

    public String shortString() {
        return "Order "+id + ":" + food +":" + customer;
    }

    @Override
    public String toString() {
        return "Order:" + id + " item:" + food +
                " for:" + customer + " served:" + waitPerson;
    }
}
