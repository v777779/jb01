package ch14.ex24.integra.factory;


/**
 * Created by V1 on 10-Mar-17.
 */
public class FanBelt extends Belt {
    public static FanBelt NULL = new NullFanBelt();

    public static class Factory implements IFactory {

        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }

    private static class NullFanBelt extends FanBelt implements INull {
        private NullFanBelt() {  // так и так вызывается
            super();
        }

        @Override
        public String getModel() {
            return "ModelBelt.NULL";
        }
        @Override
        public String toString() {
            return "FanBelt.NULL";
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
