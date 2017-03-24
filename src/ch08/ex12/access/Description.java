package ch08.ex12.access;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Description {
    String s;

    public Description(String s) {
        this.s = s;
        System.out.println("Description.Constructor."+s);
    }

    protected void dispose() {
        System.out.println("Description.dispose."+s);
    }
}
