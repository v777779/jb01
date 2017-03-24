package ch14.ex12a.access.factory;



/**
 * Created by V1 on 10-Mar-17.
 */
public class FuelFilter extends Filter  {
    public static class Factory implements IFactory<FuelFilter> {  // это класс генератор
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }

    void check() {
        System.out.println("FuelFilter.check");
    }
}
