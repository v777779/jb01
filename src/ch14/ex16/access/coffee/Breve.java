package ch14.ex16.access.coffee;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Breve extends Coffee {

    public static class Factory implements IFactory<Breve> {
        @Override
        public Breve create() {
            return new Breve();
        }
    }
}
