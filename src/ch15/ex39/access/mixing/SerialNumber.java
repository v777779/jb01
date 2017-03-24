package ch15.ex39.access.mixing;

/**
 * Created by V1 on 22.03.2017.
 */
public class SerialNumber implements ISerialNumber {
    private static long count = 1;
    private final long sNumber = count++;

    @Override
    public long getSerialNumber() {
        return sNumber;
    }
}
