package ch14.ex26.access.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class WoodWind extends Wind {
    static class Factory implements IFactory {
        @Override
        public WoodWind create() {
            return new WoodWind();
        }
    }
    @Override
    public void play(Note note) {
        System.out.println("WoodWind.play."+note);

    }
    @Override
    public String what(){
        return "WoodWind";
    }

    @Override
    public String toString() {
        return "WoodWind{}";
    }
}
