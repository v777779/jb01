package ch14.ex12a.access.factory;



/**
 * Created by V1 on 10-Mar-17.
 */
public class GenBelt extends Belt  {
    public static class Factory implements IFactory<GenBelt> {

        @Override
        public GenBelt create() {
            return new GenBelt();
        }
    }

}
