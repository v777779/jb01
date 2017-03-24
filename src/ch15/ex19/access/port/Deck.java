package ch15.ex19.access.port;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by V1 on 17.03.2017.
 */
public class Deck extends ArrayList<Cargo> {
    private int deck;
    public Deck(int deck, int nCargo, int nBoxes) {  // конструктор генерит полки
        Random rnd = new Random();
        this.deck = deck;
        for (int i = 0; i < nCargo; i++) {  // тоже самое без генератора т.к. есть параметр
            int cargo = rnd.nextInt(5000)+1000; // текущий номер груза
            add(new Cargo(cargo, nBoxes)); // это не генератор, так как есть параметр
        }
    }

    public int getDeck() {
        return deck;
    }
}
