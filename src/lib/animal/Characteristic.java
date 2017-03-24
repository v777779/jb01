package lib.animal;

/**
 * Created by V1 on 02-Mar-17.
 */
public class Characteristic {
    private String s;

    public Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic:"+s);
    }
    protected void dispose() {
        System.out.println("Disposing Characteristic:"+s);
    }
}
