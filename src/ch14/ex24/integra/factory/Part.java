package ch14.ex24.integra.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Created by V1 on 10-Mar-17.
 */
abstract public class Part implements IPart {
    private static List<IFactory> pList = new ArrayList<>(); // IFactory это интерфейс
    private static Random rnd = new Random();

    static {  // static block
        pList.add(new FuelFilter.Factory());  // это пока только список типов деталек пустой
        pList.add(new AirFilter.Factory());
        pList.add(new CabinAirFilter.Factory());
        pList.add(new OilFilter.Factory());
        pList.add(new FanBelt.Factory());
        pList.add(new PWSBelt.Factory());
        pList.add(new GenBelt.Factory());
    }

    public static Part createRandom() {     // точно также создает объекты Part
        int n = rnd.nextInt(pList.size());  // случайным образом детальку из списка
        return  pList.get(n).create();       // создается из типа деталька экземпляр
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
