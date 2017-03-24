package ch.ex11.dfilter;

import ch.ex11.dtext.IProcessor;

/**
 * Created by V1 on 13-Feb-17.
 */
abstract public class DFilterAdapter implements IProcessor {
    public DWaveform w = new DWaveform();

    @Override
    public Object getData() {
        return w;
    }
    @Override
    public String name() {
        return getClass().getSimpleName(); // get simple Name of Class
    }
    @Override
    public Object process(Object object) {
        return  process((DWaveform)object);  // делегирование метода
    }
    abstract protected DWaveform process(DWaveform object); // переопределен восходящее преобразование


}
