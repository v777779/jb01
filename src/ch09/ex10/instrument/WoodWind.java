package ch.ex10.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class WoodWind extends Wind {
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
