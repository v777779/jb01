package hw.vpex.arrays.dblink;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Link {
    int data;
    Link next;
    Link prev;

    public Link() {
        data = 0;
        next = null;
        prev = null;
    }

    public Link(int value) {
        data = value;
        next = null;
        prev = null;
    }

    public int getKey() {
        return data;
    }
    public void DisplayLink() {
        System.out.print(data + " ");
    }


}
