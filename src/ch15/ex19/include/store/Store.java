package ch15.ex19.include.store;

import java.util.ArrayList;

/**
 * Created by V1 on 17.03.2017.
 */
public class Store extends ArrayList<Aisle> {
    private ArrayList<Checkout> checkouts = new ArrayList<>();
    private Office office = new Office(); // one office for all
    private int nAisles, nShelves, nProducts;

    public Store(int nAisles, int nShelves, int nProducs) {
        this.nAisles = nAisles;
        this.nShelves = nShelves;
        this.nProducts = nProducs;
        for (int i = 0; i < nAisles ; i++) {
            add(new Aisle(nShelves,nProducs)); // добавить ряд
        }
    }

    @Override
    public String toString() {
        int count = 1;
        int scount = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("SeaPort Info: aisles :"+nAisles+" shelves:"+nShelves+" products:"+nProducts+"\n");
        sb.append("Office:"+office+"\n");
        for (Aisle aisle : this) {
            sb.append("Deck."+count+++": \n");
            for (Shelf shelf : aisle) {
                sb.append("Cargo."+scount++ +": \n");
                sb.append("Products: ");
                for (Product product : shelf) {
                    sb.append(product+"\n ");
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
