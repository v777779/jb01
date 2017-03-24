package ch08.ex12a.local;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Tenor extends Singer {
    private int refcount = 0;

    public Tenor() {
        super();
        System.out.println("Tenor.Constructor");
    }

    public void addRef() {    // свой счетчик ссылок
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Tenor.dispose.id"+getId());
            super.dispose();
        }
    }

    @Override
    public String toString() {
        return "Tenor{" +
                " refcount=" + refcount +
                '}';
    }
}
