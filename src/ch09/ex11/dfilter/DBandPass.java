package ch09.ex11.dfilter;

/**
 * Created by V1 on 13-Feb-17.
 */
public class DBandPass extends DFilter {
    double lowCutoff;
    double highCutoff;

    public DBandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    @Override
    public DWaveform process(DWaveform object) { // актуальная реализация
        System.out.print("DBandPass.process.");
        return object;
    }
    @Override
    public String toString() {
        return "DBPF{" + lowCutoff +
                "," + highCutoff +
                '}';
    }

}
