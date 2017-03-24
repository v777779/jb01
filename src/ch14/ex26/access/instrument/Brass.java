package ch14.ex26.access.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Brass extends Wind {

    static class Factory implements IFactory {
        @Override
        public Brass create() {
            return new Brass();
        }
    }


    @Override
    public void play(Note note) {
        System.out.println("Brass.play." + note);
    }

    @Override
    public String what() {
        return "Brass";
    }

    @Override
    public String toString() {
        return "Brass{}";
    }
}
