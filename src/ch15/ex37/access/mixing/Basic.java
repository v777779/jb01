package ch.ex37.access.mixing;

/**
 * Created by V1 on 22.03.2017.
 */
public class Basic implements IBasic {
    private String s;
    @Override
    public void setString(String s) {
        this.s = s;
    }

    @Override
    public String getString() {
        return s;
    }
}
