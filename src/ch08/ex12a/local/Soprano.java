package ch08.ex12a.local;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Soprano extends HighTone {
    private int refcount = 0;

    public Soprano() {
        super();
        System.out.println("Soprano.Constructor");
    }

    public void addRef() {    // свой счетчик ссылок
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Soprano.dispose.id"+getId());
            super.dispose();
        }
    }

    @Override
    public String toString() {
        return "Soprano{" +
                " refcount=" + refcount +
                '}';
    }
}
