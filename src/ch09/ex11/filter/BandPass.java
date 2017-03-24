package ch.ex11.filter;

/**
 * Created by V1 on 13-Feb-17.
 */
public class BandPass extends Filter{
    double lowCutoff;
    double highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    @Override
    public Waveform process(Waveform object) { // актуальная реализация
        System.out.print("DBandPass.process.");
        return object;
    }
    @Override
    public String toString() {
        return "BPF{" + lowCutoff +
                "," + highCutoff +
                '}';
    }

}
