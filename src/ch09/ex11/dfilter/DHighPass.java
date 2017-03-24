package ch.ex11.dfilter;

/**
 * Created by V1 on 13-Feb-17.
 */
public class DHighPass extends DFilter {
    double cutoff;

    public DHighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public DWaveform process(DWaveform object) {  // актуальная реализация
        System.out.print("DHighPass.process.");
        return object;
    }

    @Override
    public String toString() {
        return "DHPF{" + cutoff +
                '}';
    }
}
