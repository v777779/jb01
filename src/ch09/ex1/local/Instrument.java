package ch09.ex1.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public abstract class Instrument {                       // абстрактный класс

    public Instrument() {                               // конструктор
        System.out.println("Instrument.Constructor");
    }
    protected void dispose() {                          // завершение работы класса
        System.out.println("Instrument.dispose");
    }
    public abstract void play(Note note);               // абстрактный метод
    public abstract void adjust();                      // абстрактный метод

    @Override
    public String toString() {                          // обычный метод
        return "Instrument{}";
    }

}
