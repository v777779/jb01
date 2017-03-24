package ch12.ex30.access;

/**
 * Created by V1 on 03-Mar-17.
 */
public class WrapRTE {
    public void throwRTEx(int type) {
        switch (type) {
            case 0:
                throw new Annoy();
            case 1:
                throw new Sneeze();
            default:
                return;
        }
    }
}
