package ch09.ex11.dfilter;

/**
 * Created by V1 on 13-Feb-17.
 */
public class DWaveform {
    private static long counter;  // инициализация при вызове класса = 0
    private final long id = counter++; // каждый раз при создании экземпляра автоинкремент

    public String getId() {
        return String.valueOf(id);
    }

    @Override
    public String toString() {
        return "Wfm{" + id +
                '}';
    }
}
