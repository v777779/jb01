package ch14.ex24.access.factory;


/**
 * Created by V1 on 10-Mar-17.
 */
public class FanBelt extends Belt  {
    public static class Factory implements IFactory {

        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
    @Override
    public String getModel() {
        return "Model: AirFilter";
    }


}
