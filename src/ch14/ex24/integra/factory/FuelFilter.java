package ch14.ex24.integra.factory;


/**
 * Created by V1 on 10-Mar-17.
 */
public class FuelFilter extends Filter {
    public static FuelFilter NULL = new NullFuelFilter();

    public static class Factory implements IFactory {  // это класс генератор
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }

    private  static class NullFuelFilter extends FuelFilter implements INull {
        private NullFuelFilter() {  // так и так вызывается
            super();
        }

        @Override
        public String getModel() {
            return "ModelFilter.NULL";
        }
        @Override
        public String toString() {
            return "FuelFilter.NULL";
        }
    }

    public Part getNull() {
        return NULL;
    }

    @Override
    public String getModel() {
        return getClass().getSimpleName();
    }

    void check() {
        System.out.println("FuelFilter.check");
    }

}
