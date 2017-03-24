package ch15.ex39.access.mixing;

import java.util.Calendar;

/**
 * Created by V1 on 22.03.2017.
 */
public class TimeStamp implements ITimeStamp {
    private final long timeStamp;
    private final long timeStamp2;

    public TimeStamp() {
        timeStamp = Calendar.getInstance().getTime().getTime();
        timeStamp2 = Calendar.getInstance().getTimeInMillis();

    }

    @Override
    public long getStamp() {
        return timeStamp;
    }

    public long getTimeStamp2() {
        return timeStamp2;
    }

}
