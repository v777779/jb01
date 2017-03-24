package ch14.ex24.access.factory;


/**
 * Created by V1 on 10-Mar-17.
 */
public class AirFilter extends Filter {
    public static class Factory implements IFactory {
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }

    @Override
    public String getModel() {
        return "Model: ";
    }


}
