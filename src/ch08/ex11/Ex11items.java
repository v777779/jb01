package ch08.ex11;

import ch08.ex11.cycle.LinkedItem;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Ex11items {
    public static void main(String[] args) {
        LinkedItem linkedItem = new LinkedItem(10);
        String[] strings = new String[10];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = "item"+i;
        }

        linkedItem.fillItems(strings);
        linkedItem.showItems();
        linkedItem.rightShift(4);
        linkedItem.showItems();
        linkedItem.rightShift(17);
        linkedItem.showItems();
        linkedItem.rightShift(27);
        linkedItem.showItems();



    }
}
