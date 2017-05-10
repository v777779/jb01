package lib.pqueue;

/**
 * Created by V1 on 29-Mar-17.
 */
public class Item implements Comparable<Item>{
    private char primary;
    private int secondary;
    private String item;

    public Item( String item, char primary, int secondary) {
        this.item = item;
        this.primary = primary;
        this.secondary = secondary;
    }

    @Override
    public int compareTo(Item o) {
        if (primary < o.primary) {
            return -1;
        }
        if (primary == o.primary) {
            if (secondary < o.secondary) {
                return -1;
            } else if (secondary == o.secondary) {
                return 0;
            }
        }
        return 1;
    }
    @Override
    public String toString() {
        return Character.toString(primary) +
                secondary +":" + item;
    }
}
