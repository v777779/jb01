package ch14.ex12a.access.factory;


/**
 * Created by V1 on 10-Mar-17.
 */
public class FanBelt extends Belt {
    public static class Factory implements IFactory<FanBelt> {

        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }

    void check() {
        System.out.println("FanBelt.check");
    }
}
