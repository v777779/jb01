package ch.ex38.local.decorator;

import java.util.Calendar;

/**
 * Created by V1 on 22.03.2017.
 */
public class TimeStamp extends Decorator {
    private final long timeStamp;

    public TimeStamp(Basic basic) {
        super(basic); // делегируем сразу
        timeStamp = Calendar.getInstance().getTime().getTime();
    }
    public long getStamp() {
        return timeStamp;
    }

}
