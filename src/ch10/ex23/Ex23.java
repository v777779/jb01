package ch.ex23;

import ch.ex23.access.ISelector;
import ch.ex23.access.Sequence;
import ch.ex23.include.*;
import ch.ex23.local.*;
import ch.ex23.remote.*;
import ch.ex23.integra.*;

/**
 * Created by V1 on 16-Feb-17.
 */
public class Ex23 {
    public static void main(String[] args) {
        System.out.println("\nNested Class Hierarchy Upstream Access Check\n");
        IGun gun = new IGun.Gun(); // готовый

        IGun gun2 = new IGun() {  // анонимный
            public void shoot() {
            }

            public void charge() {
            }

            public void service() {
            }

            @Override
            public ICart getCart() {
                return null;
            }
        };

        gun.getCart().show();
        IGun.getCartStatic().show();

        System.out.println("\nNested Class Check\n");
        ICard c2 = new ICardHolder.CardVisa();  // через конструктор   открытый класс
        ICard c4 = ICardHolder.getCardMaster(); // через static метод  открытый класс
        ICard c6 = ICardHolder.getCardVTB();   // через static метод только  закрытый класс
        ICard c8 = ICardHolder.getCardSB(); // через static метод закрытый класс

        c2.status();
        c4.status();
        c6.status();
        c8.status();

        System.out.println("\nInner Class Multiple Realization  Check\n");
        Play.playA(new ClassX()); // прокатило  A
        Play.playB(new ClassX()); // прокатило B
        Play.playA(new ClassY()); // прокатило  A
        Play.playB(new ClassY().getB()); // прокатило B  через внутренний класс
        Play.playA(new ClassZ().getA()); // прокатило  A
        Play.playB(new ClassZ().getB()); // прокатило B  через внутренний класс
        System.out.println();
        Play.playD(new ClassF()); // прокатило
        Play.playE(new ClassF().getE()); // прокатило
        Play.playD(new ClassH().getD()); // прокатило
        Play.playE(new ClassH().getE()); // прокатило

        System.out.println("\nExercise 23 Inner  Class Check\n");
        Sequence sq = new Sequence(20);
        ISelector sf = sq.getForward();  // доступ из внешнего класса во внутренний через экземпляр
        ISelector sr = sq.getReverse();

            ISelector.play(sf); // через static
            sq.play(sr); // работа внешнего класса с внутренним и внутреннего с внешним



    }
}
