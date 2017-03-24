package ch07.ex1.local;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Cup {
    int i=1;
    String s="This is a Cup";

    public void getShow() {
        show();
    }
    void show() {
        System.out.println(s);
    }

    public Cup(int i) {
        this.i = i;
    }

    public Cup() {
    }

    @Override
    public String toString() {

        return  (s +" i = "+ i);
    }
}
