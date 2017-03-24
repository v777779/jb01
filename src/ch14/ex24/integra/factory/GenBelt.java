package ch14.ex24.integra.factory;


/**
 * Created by V1 on 10-Mar-17.
 */
public class GenBelt extends Belt {
    public static GenBelt NULL = new NullGenBelt();

    public static class Factory implements IFactory {
        @Override
        public GenBelt create() {
            return new GenBelt();
        }
    }

    private static class NullGenBelt extends GenBelt implements INull {
        private NullGenBelt() {  // так и так вызывается
            super();
        }

        @Override
        public String getModel() {
            return "ModelBelt.NULL";
        }
       @Override
        public String toString() {
            return "GenBelt.NULL";
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
