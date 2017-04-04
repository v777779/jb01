package ch17.ex42.remote;

/**
 * Created by V1 on 04-Apr-17.
 */
public class VeryBig {
    private static final int SIZE = (int) 1e4;
    private long[] longArray = new long[SIZE]; // большой массив
    private String ident;

    public VeryBig(String ident) {
        this.ident = ident;
    }

    public String getIdName() {
        return ident;
    }

    @Override
    protected void finalize() {
        System.out.println("Finalize:" + ident);
    }

    @Override
    public String toString() {
        return ident;
    }
}



