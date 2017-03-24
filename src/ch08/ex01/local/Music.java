package ch08.ex01.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Music {
    public void play(Wind i) {         // перегрузка
        i.play(Note.MIDDLE_C);  // одну и ту же ноту
    }
    public void play(Brass i) {        // перегрузка
        i.play(Note.MIDDLE_C);  // одну и ту же ноту
    }
    public void play(Stringed i) {     // перегрузка
        i.play(Note.MIDDLE_C);  // одну и ту же ноту
    }
}
