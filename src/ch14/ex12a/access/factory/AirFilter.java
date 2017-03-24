package ch14.ex12a.access.factory;



/**
 * Created by V1 on 10-Mar-17.
 */
public class AirFilter extends Filter  {
    public static class Factory implements IFactory<AirFilter> {

        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }

}
