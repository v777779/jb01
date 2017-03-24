package ch10.ex19;

import ch10.ex19.access.Cort;
import ch10.ex19.access.IPlayers;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Ex19 {
    public static void main(String[] args) {
        System.out.println("\nNested Class Check\n");
        IPlayers  p = Cort.getNested();  // по интерфейсу вытащили экземпляр класса наружу
        System.out.println(p);           // получили доступ к его методам
    }

}
