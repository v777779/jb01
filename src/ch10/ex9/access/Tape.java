package ch.ex9.access;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Tape {

    public IRecord getTape() {  // method create object inside it
        class Record implements IRecord {
            @Override
            public void play() {
                System.out.println("Record.play");
            }
        }
        return new Record();
    }
}
