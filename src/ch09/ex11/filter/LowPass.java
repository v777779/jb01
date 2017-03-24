package ch.ex11.filter;

/**
 * Created by V1 on 13-Feb-17.
 */
public class LowPass extends Filter{
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform object) { // актуальная реализация
        System.out.print("DLowPass.process.");
        return object;
    }

    @Override
    public String toString() {
        return "LPF{" + cutoff +
                '}';
    }
}
