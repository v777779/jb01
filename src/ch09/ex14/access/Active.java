package ch09.ex14.access;

/**
 * Created by V1 on 13-Feb-17.
 */
public class Active {
    public static void iWater(WaterMaker object) {
        object.waterStart();
    }
    public static void iGas(GasMaker object) {
        object.gasStart();
    }
    public static void iAir(AirMaker object) {
        object.airStart();
    }
    public static void iBuild(Builder object) {
        object.buildStart();
    }
    public static void cPerson(Person object ) {
        object.activity();
    }
    public static void cStuff(Stuff object ) {
        object.mode();
    }

}
