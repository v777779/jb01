package ch09.ex11.filter;

/**
 * Created by V1 on 13-Feb-17.
 */
public class HighPass extends Filter{
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform object) {  // актуальная реализация
        System.out.print("DHighPass.process.");
        return object;
    }

    @Override
    public String toString() {
        return "HPF{" + cutoff +
                '}';
    }
}
