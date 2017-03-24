package ch.ex10.access;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Play {
    public IPlay getTape(boolean flag) {  // method create object inside it
        if (flag) {
            class Record implements IPlay { // область видимости scope {flag = true}
                @Override
                public void play() {
                    System.out.println("Record.play");
                }
            } // eof class
            return new Record();

        }else{
            class MidiBoard implements IPlay { // область видимости scope {flag = false}
                @Override
                public void play() {
                    System.out.println("MidiBoard.play");
                }
            } // eof class
            return new MidiBoard();
        }
    }
}
