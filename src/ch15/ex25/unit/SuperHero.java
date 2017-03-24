package ch.ex25.unit;

/**
 * Created by V1 on 18.03.2017.
 */
public class SuperHero<POWER extends ISuperPower> {  // пока только мощь интерфейса
    POWER power;

    public SuperHero(POWER power) {
        this.power = power;
    }

    public POWER getPower() {
        return power;
    }
}
