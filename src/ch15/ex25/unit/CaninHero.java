package ch15.ex25.unit;

/**
 * Created by V1 on 18.03.2017.
 */
public class CaninHero<POWER extends ISuperHearing & ISuperSmell> extends SuperHero<POWER> {  // плюс 2 интерфейса
    public CaninHero(POWER power) {
        super(power);
    }

    void hear() {
        power.hearSubtleNoises();
    }

    void smell() {
        power.trackBySmell();
    }
}
