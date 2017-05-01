package ch21.ex12.codeb;

/**
 * Vadim Voronov
 * Created: 01-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;
    public  static int nextSerialNumber() {
        return serialNumber++;
    }
 // решение проблемы
    public  synchronized static int nextSerialNumber2() {
        return serialNumber++;
    }

}
