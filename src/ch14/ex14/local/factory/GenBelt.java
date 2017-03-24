package ch14.ex14.local.factory;


/**
 * Created by V1 on 10-Mar-17.
 */
public class GenBelt extends Belt {
    public static class Factory implements IFactory {

        @Override
        public GenBelt create() {
            return new GenBelt();
        }
    }

}
