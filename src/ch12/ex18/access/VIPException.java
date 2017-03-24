package ch12.ex18.access;

/**
 * Created by V1 on 02-Mar-17.
 */
public class VIPException extends Exception{
    @Override
    public String toString() {
        return "Very Important Exception ";
    }
}
