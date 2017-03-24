package ch14.ex14.local.factory;


/**
 * Created by V1 on 10-Mar-17.
 */
public class CabinAirFilter extends Filter  {
    public static class Factory implements IFactory {

        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }

}
