package ch.ex11.dfilter;

/**
 * Created by V1 on 13-Feb-17.
 */
public class DLowPass extends DFilter {
    double cutoff;

    public DLowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public DWaveform process(DWaveform object) { // актуальная реализация
        System.out.print("DLowPass.process.");
        return object;
    }

    @Override
    public String toString() {
        return "DLPF{" + cutoff +
                '}';
    }
}
