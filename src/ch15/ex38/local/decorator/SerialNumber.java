package ch15.ex38.local.decorator;

/**
 * Created by V1 on 22.03.2017.
 */
public class SerialNumber extends Decorator {
    private static long count = 1;
    private final long sNumber = count++;

    public SerialNumber(Basic basic) {
        super(basic);
    }
    public long getSerialNumber() {
        return sNumber;
    }

}
