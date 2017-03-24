package ch14.ex24.integra.factory;


/**
 * Created by V1 on 10-Mar-17.
 */
public class OilFilter extends Filter {
    public static OilFilter NULL = new NullOilFilter();

    public static class Factory implements IFactory {

        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }

    private static class NullOilFilter extends OilFilter implements INull {
        private NullOilFilter() {  // так и так вызывается
            super();
        }

        @Override
        public String getModel() {
            return "ModelFilter.NULL";
        }

        @Override
        public String toString() {
            return "OilFilter.NULL";
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
