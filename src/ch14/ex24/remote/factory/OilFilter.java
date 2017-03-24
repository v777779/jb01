package ch14.ex24.remote.factory;


/**
 * Created by V1 on 10-Mar-17.
 */
public class OilFilter extends Filter {
    public static class Factory implements IFactory {

        @Override
        public IPart create() {
            return new OilFilter();
        }
    }
    @Override
    public String getModel() {
        return "Model: OilFilter";
    }


}
