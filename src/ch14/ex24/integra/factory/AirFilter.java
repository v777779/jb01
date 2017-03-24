package ch14.ex24.integra.factory;


/**
 * Created by V1 on 10-Mar-17.
 */
public class AirFilter extends Filter {
    public static AirFilter NULL = new NullAirFilter();

    public static class Factory implements IFactory {
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }

    // реализация обязательна, чтобы реализовать методы класса для Null объекта
    private static class NullAirFilter extends AirFilter implements INull {
        private NullAirFilter() {  // так и так вызывается
            super();
        }

        @Override
        public String getModel() {
            return "ModelFilter.NULL";
        }

        @Override
        public String toString() {
            return "AirFilter.NULL";
        }
    }


    public Part getNull() {   // INull interface
        return NULL;
    }

    @Override
    public String getModel() {
        return getClass().getSimpleName();
    }

}
