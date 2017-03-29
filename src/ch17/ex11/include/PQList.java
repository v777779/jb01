package ch17.ex11.include;

import java.util.PriorityQueue;

/**
 * Created by V1 on 29-Mar-17.
 */
public class PQList extends PriorityQueue<Item> {
    static class Item2 implements Comparable<Item2> {
        private char primary;
        private int secondary;
        private String item;

        public Item2(String item, char primary, int secondary) {
            this.item = item;
            this.primary = primary;
            this.secondary = secondary;
        }

        @Override
        public int compareTo(Item2 o) {
            if (primary < o.primary) {
                return 1;
            }
            if (primary == o.primary) {
                if (secondary > o.secondary) {
                    return 1;
                } else if (secondary == o.secondary) {
                    return 0;
                }
            }
            return -1;
        }

        @Override
        public String toString() {
            return Character.toString(primary) +
                    secondary + ":" + item;
        }
    }

    public void add(String item, char pri, int sec) {  // использует внешний класс <Item>
        super.add(new Item(item, pri, sec));
    }

}
