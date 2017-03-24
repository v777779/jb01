package ch06.ex6;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Play {
    private int i;

    private void show() {
        System.out.println("Private Play show()");
    }

    void getShow() {
        System.out.print("Default Play getShow() > ");
        show();
    }

    public int getI() {
        System.out.println("getter Play private i = "+i);
        return i;
    }

    public void setI(int i) {
        System.out.println("setter Play private i = "+i);
        this.i = i;
    }
}
