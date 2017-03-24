package ch08.ex12a.local;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Shared {
    private int refcount = 0;
    private static long counter = 0;   // Class level
    private final long id = counter++; // Fixed ID of instance

    public Shared() {
        System.out.println("Shared.Constructor");
    }
    public void addRef() {  // свой счетчик ссылок
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Shared.dispose");
            //super.dispose()
        }
    }

    @Override
    public String toString() {
        return "Shared{" +
                "id=" + id +
                '}';
    }
}
