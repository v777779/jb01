package ch15.ex25.unit;

/**
 * Created by V1 on 18.03.2017.
 */
public class SuperSleuth<POWER extends IXRaySuperPower> extends SuperHero<POWER> {  // плюс мощь IXraySuperPower
    public SuperSleuth(POWER power) {
        super(power);
    }

    void see() {
        power.seeThroughWalls();
    }

}
