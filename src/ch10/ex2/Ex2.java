package ch.ex2;

import ch.ex2.local.Sequence;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("\n Inner Class CheckGarden\n");
        Sequence sq = new Sequence(10);
        Sequence.Selector sl = sq.getInner();
        sq.showLinks();
        sl.showLinks();
        System.out.println("\nSelector Show Integer[] Array");
        for (int i = 0; i < 10 ; i++) {
            sq.add(Integer.toString(i));  // добавить 10 объектов типа Integer
        }
        while (!sl.checkEnd()) {
            System.out.print(sl.getCurrent()+" ");
            sl.nextIndex();
        }
        System.out.println();
        System.out.println("\nExercise 2 Inner Class Check\n");
        Sequence ss = new Sequence(10);
        String[] s = new String[] {"Checking Down","Trust Before", "Linkoln Magic","Traffic Rise","Stealth On",
                                     "Mpving Close","Lunch End","Daily Mail","Coffee Break","Home Address"};

        Sequence.Selector s2 = ss.new Selector();   // короткий синтаксис создания экземпляра внутреннего класса
        for (int i = 0; i < s.length; i++) {
            ss.add(s[i]);
        }
        while (!s2.checkEnd()) {
            System.out.println(s2.getCurrent()+" ");
            s2.nextIndex();
        }


    }
}
