package ch14.ex24.access.factory;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Created by V1 on 10-Mar-17.
 */
public class Part implements IPart{
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
        return pList.get(n).create();       // создается из типа деталька экземпляр
    }



//getNull  Object of Class
    public static IPart getNull(Class<? extends Part> type) {
        return (IPart) Proxy.newProxyInstance(
                Part.class.getClassLoader(),
                new Class[]{ IPart.class, Null.class},   // здесь только интерфейсы
                new PartProxy(type)
        );
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public String getModel() {
        return "";
    }
}
