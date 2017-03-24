package ch15.ex37.local.mixing;

/**
 * Created by V1 on 22.03.2017.
 */
public class BasicMixing extends Basic implements ITimeStamp,ISerialNumber {
    private ITimeStamp t = new TimeStamp();
    private ISerialNumber s = new SerialNumber();

    @Override
    public long getStamp() {
        return t.getStamp();  // вытаскиваем готовую реализацию через делегирование
    }

    @Override
    public long getSerialNumber() {
        return s.getSerialNumber(); // делегирование реализации метода
    }
}
