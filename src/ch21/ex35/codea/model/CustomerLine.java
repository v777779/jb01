package ch21.ex35.codea.model;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CustomerLine extends ArrayBlockingQueue<Customer> {

    public CustomerLine(int capacity) {
        super(capacity);
    }

    @Override
    public String toString() {
        if (this.size() == 0) {
            return "[Empty]";
        }
        StringBuilder sb = new StringBuilder();
        for (Customer customer : this) {
            sb.append(customer);
        }
        return sb.toString();
    }
}
