package ch12.ex12a.access;

/**
 * Created by V1 on 02-Mar-17.
 */
public class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return (state)?"вкл.":"выкл.";
    }
}
