package ch08.ex14.local;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Shared {
    private int refcount = 0;
    private static long counter = 0;   // Class level
    private final long id = counter++; // Fixed ID of instance
    private boolean checkedOut = false; // constructor не отработал

    public Shared() {
        checkedOut = true;
        System.out.println("Shared.Constructor");
    }
    public void addRef() {  // свой счетчик ссылок
        refcount++;
    }

    public void dispose() {
        if (--refcount == 0) {
            System.out.println("Shared.dispose");
            checkedOut = false; // очищаем
            //super.dispose()
        }
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("***Error Shared.finalize");
        }
    }

    @Override
    public String toString() {
        return "Shared{" +
                "id=" + id +
                '}';
    }
}
