package ch10.ex12a.access;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Tape {

    public IRecord getTape() {  // method create object inside it
        return new IRecord() {  // по интерфейсу создаем объект
            {
                System.out.println("Anonymous Class Constructor");
            }
            @Override
            public void play() {
                System.out.println("Anonymous.Record.play");
            }
        };
    }
}
