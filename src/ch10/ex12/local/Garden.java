package ch.ex12.local;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Garden {
    private int flower = 27;
    public String sInside = "String_Garden_Value";
    public Garden() {
    }

    public Garden(String sInside) {
        this.sInside = sInside;
    }

    public String showFlower() {
        return ("Garden:"+sInside);
    }

    public String getSuper() {
        return null;
    }

    public String getsInside() {
        return sInside;
    }

}
