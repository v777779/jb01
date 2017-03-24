package ch07.ex12.local;

/**
 * Created by V1 on 08-Feb-17.
 */
public class PlaceSetting extends Custom{
    private Spoon sp;
    private Fork fr;
    private Knife kn;
    private DinnerPlate dp;


    public PlaceSetting(int i) {
        super(i+1);                     // класс предка Custom
        sp = new Spoon(i+2);            // встроенный класс содержит предка
        fr = new Fork(i+3);             // встроенный класс содержит предка
        kn = new Knife(i+4);            // встроенный класс содержит предка
        dp = new DinnerPlate(i+5);      // встроенный класс содержит предка
        System.out.println("PlaceSetting.Constructor: "+i+" .. done...");
    }
}
