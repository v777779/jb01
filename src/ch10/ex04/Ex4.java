package ch10.ex04;

import ch10.ex02.local.Sequence;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("\n Inner Class CheckGarden\n");
        Sequence sq = new Sequence(10);
        Sequence.Selector sl = sq.getInner();
        sq.showLinks();
        sl.showLinks();

    }
}