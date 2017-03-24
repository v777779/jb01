package ch08.ex12a.local;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Vocal extends HighTone {
    private int refcount = 0;

    public Vocal() {
        super();
        System.out.println("Vocal.Constructor");
    }

    public void addRef() {    // свой счетчик ссылок
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Vocal.dispose.id" + getId());
            super.dispose();
        }
    }

    @Override
    public String toString() {
        return "Vocal{" +
                "refcount=" + refcount +
                '}';
    }
}
