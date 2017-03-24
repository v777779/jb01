package ch.ex5.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Wind implements Instrument, Cargo{

    public Wind() {
        System.out.println("Wind.Constructor");
    }

    @Override  // первый интерфейс  Instrument
    public void play(Note note) {
        System.out.println("Wind.Instrument.play."+note);
    }
    @Override
    public String what(){
        return "Wind{}";
    }
    @Override
    public void adjust() {
        System.out.println("Wind.Instrument.adjust");
    }

    @Override
    public String toString() {
        return "Wind{}";
    }

    @Override // второй интерфейс Cargo
    public void weight() {
        System.out.println("Wind.Cargo.weight");
    }
    @Override
    public void move() {
        System.out.println("Wind.Cargo.move");
    }
    @Override
    public void check() {
        System.out.println("Wind.check");
    }
}
