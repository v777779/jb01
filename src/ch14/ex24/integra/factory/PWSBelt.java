package ch14.ex24.integra.factory;


/**
 * Created by V1 on 10-Mar-17.
 */
public class PWSBelt extends Belt {
    public static PWSBelt NULL = new NullPWSBelt();

    public static class Factory implements IFactory {

        @Override
        public PWSBelt create() {
            return new PWSBelt();
        }
    }

    private static class NullPWSBelt extends PWSBelt implements INull {
        private NullPWSBelt() {  // так и так вызывается
            super();
        }

        @Override
        public String getModel() {
            return "ModelBelt.NULL";
        }

        @Override
        public String toString() {
            return "PWSBelt.NULL";
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
