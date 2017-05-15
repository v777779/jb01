package ch21.ex42.exercise.car;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Car {
    private boolean waxOn = false;

    public void waxed() throws NullPointerException {  // синхронизированный метод
        if(waxOn == true)
            throw new NullPointerException();
        waxOn = true;
    }

    public void buffed()throws NullPointerException  {  // синхронизированный метод но нет handshake
        if(waxOn == false)
            throw new NullPointerException();
        waxOn = false;
    }


}
