package ch12.ex18.access;

/**
 * Created by V1 on 02-Mar-17.
 */
public class NOPException extends Exception{
    public NOPException() {
    }

    @Override
    public String toString() {
        return "Normal Priority Exception ";
    }
}
