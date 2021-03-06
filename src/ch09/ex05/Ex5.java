package ch09.ex05;

import ch09.ex05.instrument.Instrument;
import ch09.ex05.instrument.Note;
import ch09.ex05.instrument.Trumpet;
import ch09.ex05.instrument.Wind;

/**
 * Created by V1 on 12-Feb-17.
 */
public class Ex5 {
    public static void main(String[] args) {
        System.out.println("\nAbstract vs Static Methods Check\n");
        Stone stone = new Stone();
        System.out.println(stone);

        System.out.println("\nExercise 5 Interface Check\n");
        Wind trumpet = new Trumpet();

        System.out.println("\nInterface 1 Check\n");
        trumpet.adjust();                           // первый интерфейс
        trumpet.play(Note.MIDDLE_C);
        System.out.println("VALUE_INT."+Instrument.VALUE_INT);

        System.out.println("\nInterface 2 Check\n");
        trumpet.weight();                           // второй интерфейс
        trumpet.move();
        trumpet.check();
    }
}
