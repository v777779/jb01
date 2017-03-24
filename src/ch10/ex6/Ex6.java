package ch10.ex6;

import ch10.ex6.local.IContents;
import ch10.ex6.local.IDestination;
import ch10.ex6.local.Parcel4;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Ex6 {
    public static void main(String[] args) {
        System.out.println("\nInner Class Interface Check\n");
        Parcel4 p4 = new Parcel4();
        IContents pc = p4.getPContents();  // интерфейс внешний вытаскиваем ссылку на внутренний закрытый класс
        IDestination pd = p4.getPDestination("Toronto");
        System.out.println(pd.getLabel()+":"+pc.getValue()); // работает как с обычной ссылкой по интерфейсу
    }
}
