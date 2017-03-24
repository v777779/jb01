package ch05.ex12;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Tank {
    boolean emptyField = false;

    public void setEmpty(boolean empty) {
        this.emptyField = empty;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GC called > "+this);
        if (!emptyField) {
            System.out.println("Error: Tank is not Empty");
        }
        super.finalize();
    }

    public Tank(boolean emptyField) {
        this.emptyField = emptyField;
    }

    public Tank() {
        emptyField = false;
    }
}
