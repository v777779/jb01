package ch14.ex14.access.factory;


/**
 * Created by V1 on 10-Mar-17.
 */
public class OilFilter extends Filter {
    public static class Factory implements IFactory<OilFilter> {

        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }

}
