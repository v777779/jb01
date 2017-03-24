package ch15.ex19.access.port;

import java.util.ArrayList;

/**
 * Created by V1 on 17.03.2017.
 */
public class SeaPort extends ArrayList<Deck> {
    private ArrayList<Checkout> checkouts = new ArrayList<>();
    private Office office = new Office(); // one office for all
    private int nDecks, nCargos, nBoxes;

    public SeaPort(int nDecks, int nCargos, int nBoxes) {
        this.nDecks = nDecks;
        this.nCargos = nCargos;
        this.nBoxes = nBoxes;
        int ndeck = 1;
        for (int i = 0; i < nDecks ; i++) {
            add(new Deck(ndeck++,nCargos,nBoxes)); // добавить палубу
        }
    }

    @Override
    public String toString() {
        int count = 1;
        int scount = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("SeaPort Info: decks: "+nDecks+" cargos: "+nCargos+" boxes:"+nBoxes+"\n");
        sb.append("Office:"+office+"\n");
        for (Deck deck : this) {
            sb.append("Deck."+deck.getDeck()+": \n");
            for (Cargo cargo : deck) {
                sb.append("Cargo."+cargo.getCargo()+": \n");
                for (Box box : cargo) {
                    sb.append(box+"\n");
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
