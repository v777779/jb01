package ch12.ex29.access;

/**
 * Created by V1 on 03-Mar-17.
 */
public class StormEx extends RuntimeException {
    public StormEx() {
    }

    public StormEx(String message) {
        super(message);
    }
}
