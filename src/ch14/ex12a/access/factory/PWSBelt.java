package ch14.ex12a.access.factory;



/**
 * Created by V1 on 10-Mar-17.
 */
public class PWSBelt extends Belt  {
    public static class Factory implements IFactory {

        @Override
        public PWSBelt create() {
            return new PWSBelt();
        }
    }

}
