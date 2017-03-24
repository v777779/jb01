package ch10.ex12.local;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Row extends Garden {
    public String sInside = "String_Row_Value";

    public Row() {
    }

    public Row(String sInside) {
        this.sInside = sInside;
    }

    @Override
    public String getsInside() {
        return sInside;
    }

 }
