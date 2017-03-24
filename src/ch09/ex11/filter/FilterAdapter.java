package ch09.ex11.filter;

import ch09.ex11.text.Processor;

/**
 * Created by V1 on 13-Feb-17.
 */
abstract public class FilterAdapter extends Processor {
    public Waveform w = new Waveform();

    public Object getData() {
        return w;
    }

    @Override
    public Object process(Object object) {              // делегирование метода
        return  process((Waveform)object);
    }

   abstract protected Waveform process(Waveform object);// переопределен
}
