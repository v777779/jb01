package ch14.ex24.integra.factory;


/**
 * Created by V1 on 10-Mar-17.
 */
public class CabinAirFilter extends Filter {
    public static CabinAirFilter NULL = new NullCabinAirFilter();

    public static class Factory implements IFactory {

        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }

    private static class NullCabinAirFilter extends CabinAirFilter implements INull {
        private NullCabinAirFilter() {  // так и так вызывается
            super();
        }
        @Override
        public String getModel() {
            return "ModelFilter.NULL";
        }

        @Override
        public String toString() {
            return "CabinAirFilter.NULL";
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
