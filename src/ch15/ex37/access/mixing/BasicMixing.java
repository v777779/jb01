package ch15.ex37.access.mixing;

import java.awt.*;

/**
 * Created by V1 on 22.03.2017.
 */
public class BasicMixing extends Basic implements ITimeStamp,ISerialNumber, IColor {
    private ITimeStamp t = new TimeStamp();
    private ISerialNumber s = new SerialNumber();
    private ColorG c = new ColorG(new ColorR());  // реализуем через анонимный класс

    @Override
    public long getStamp() {
        return t.getStamp();  // вытаскиваем готовую реализацию через делегирование
    }

    @Override
    public long getSerialNumber() {
        return s.getSerialNumber(); // делегирование реализации метода
    }

    @Override
    public Color getColor() {
        return c.getItem().getColor();
    }
}
