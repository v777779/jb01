package ch14.ex14.access.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Created by V1 on 10-Mar-17.
 */
public class Part {
    private static List<Class<?extends Part>> pList = new ArrayList<>(); // IFactory это интерфейс
    private static Random rnd = new Random();

    static {  // static block
        pList.add(FuelFilter.class);  // это пока только список типов деталек пустой
        pList.add(AirFilter.class);
        pList.add(CabinAirFilter.class);
        pList.add(OilFilter.class);
        pList.add(FanBelt.class);
        pList.add(PWSBelt.class);
        pList.add(GenBelt.class);
    }

    public static Part createRandom() {     // точно также создает объекты Part
        int n = rnd.nextInt(pList.size());  // случайным образом детальку из списка
        try {
            if (!Part.class.isAssignableFrom(pList.get(n))) {
                System.out.println("catch: Class does not extend Part");
                throw new RuntimeException();
            }
            return (Part) pList.get(n).newInstance();       // создается из типа деталька экземпляр
        } catch (Exception e) {
            System.out.println("catch: Class is not compatible"+e.getMessage());
            throw new RuntimeException();
        }
    }


    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
