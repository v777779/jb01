package ch21.ex36.exercise.restaurant;

import java.util.ArrayList;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class OrderTicket extends ArrayList<Order> {
    private static int counter = 0;
    private final int id = counter++;

    public String getId() {
        return "Ticket"+id;
    }


    public String shortString() {
        StringBuilder sb = new StringBuilder();
        sb.append( "[Ticket" + id );
        for (Order order : this) {
            sb.append("[");
            sb.append(order.shortString());
            sb.append("]");
        }
        sb.append("]");

        return sb.toString();
    }
}
