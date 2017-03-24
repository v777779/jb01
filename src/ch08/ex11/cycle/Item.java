package ch08.ex11.cycle;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Item {
    String s = "";
    Item pPrev = null;
    Item pNext = null;

    void setFirst() {
        pPrev = null;
    }

    void setLast() {
        pNext = null;
    }
}
