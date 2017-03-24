package ch.ex11.filter;

/**
 * Created by V1 on 13-Feb-17.
 */
public class Filter extends FilterAdapter {

   @Override
    public Waveform process(Waveform object) {  // переопрделена
        return object;
    }

}
