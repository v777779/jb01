package ch.ex25.unit;

/**
 * Created by V1 on 18.03.2017.
 */
public class SuperHearSmell implements ISuperHearing, ISuperSmell {  // реализация интерфейсов класс объект
    @Override
    public void trackBySmell() {
        System.out.println("SuperHearSmell.trackBySmell");
    }

    @Override
    public void hearSubtleNoises() {
        System.out.println("SuperHearSmell.hearSubtleNoises");
    }
}
