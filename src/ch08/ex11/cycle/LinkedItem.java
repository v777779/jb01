package ch08.ex11.cycle;

/**
 * Created by V1 on 10-Feb-17.
 */
public class LinkedItem {
    Item[] linkedItems;

    public LinkedItem(int size) {
        this.linkedItems = new Item[size];
        for (int i = 0; i < size ; i++) {
            linkedItems[i] = new Item();
            if(i==0){
                linkedItems[i].pPrev = null;
                continue;
            }
            linkedItems[i-1].pNext = linkedItems[i]; // pNext
            linkedItems[i].pPrev = linkedItems[i-1]; // pPrev
        }
    }


    public int getLast() {
        for (int i = 0; i < linkedItems.length; i++) {
            if (linkedItems[i] == null) {
                return 0;    // error in list
            }
            if (linkedItems[i].pNext == null) {
                return i;
            }
        }
        return linkedItems.length-1;  // not found get last in array
    }

    public int getFirst() {
        for (int i = 0; i < linkedItems.length; i++) {
            if (linkedItems[i] == null) {
                return 0; // error in list
            }
            if (linkedItems[i].pPrev == null) {
                return i;
            }
        }
        return 0;  // not found get first in array
    }



    public void fillItems(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            linkedItems[i].s = strings[i];
        }
    }

    public void showItems() {
        System.out.println();
        int i = getFirst();
               Item pItem = linkedItems[getFirst()];
        i = 0; // counter
        while(i++ < linkedItems.length ){
            if(pItem == null) {
                System.out.println("Error List");
                return;
            }
            System.out.println(pItem.s);
            pItem = pItem.pNext;
        }
    }

    private void shortList(int first, int last) {     // short list in cycle
        linkedItems[first].pPrev = linkedItems[last];
        linkedItems[last].pNext = linkedItems[first];
    }
    private void openList(int first, int shift) {
        first = ((first+shift) % linkedItems.length);  // roundup first index
        Item pLink =  linkedItems[first];
             pLink.pPrev.setLast(); //previous Item setLast .pNext = null
             pLink.setFirst();      // current Item setFirst .pPrev = null
    }


    public void rightShift(int shift) {
        int length = linkedItems.length;
        shift = shift % length;

        if (shift == 0 ) {  // shift = 0 OR shift = length of array >> shift 0
            return;
        }

        int first = getFirst();  // index of current first
        int last = getLast();    // index of current last
        shortList(first,last);   // close list in loop
        openList(first, shift);  // open list at shifted point

    }


}
