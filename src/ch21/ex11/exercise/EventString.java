package ch21.ex11.exercise;

/**
 * Vadim Voronov
 * Created: 01-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class EventString {
    private String s;
    private String s2;
    private boolean cancel = false;  // используется один объект

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel() {
        this.cancel = true;
    }

    public EventString() {
        s = "one";
        s2 ="two";
    }

    public String getS() {
        return s;
    }

    public String getS2() {
        return s2;
    }

    public void change() {
        s = "one and two";   // incorrect state
        s2 = "two and one";  // incorrect state
        s = "one";
        s2 = "two";
    }
}
