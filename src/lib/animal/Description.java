package lib.animal;

/**
 * Created by V1 on 02-Mar-17.
 */
public class Description {
    private String s;

    public Description(String s) {
        this.s = s;
        System.out.println("Creating Description:"+s);
    }
    protected void dispose() {
        System.out.println("Disposing Description:"+s);
    }
}
