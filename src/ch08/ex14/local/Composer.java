package ch08.ex14.local;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Composer {
    private Shared shared; // просто ссылка

    private int refcount = 0;
    private static long counter = 0;   // Class level
    private final long id = counter++; // Fixed ID of instance
    private boolean checkedOut = false;


    public Composer(Shared shared) {
        System.out.println("Composer.Constructor");
        this.shared = shared;
        this.shared.addRef();  // нарастили ссылку
        this.checkedOut = true;
    }

    public static Composer[] getComposer(Shared shared) {
        Composer[] composers = new Composer[3];
        for (int i = 0; i < composers.length; i++) {
             composers[i] = new Composer(shared);
        }
        return composers;
    }

    public void dispose() {
        System.out.println("Composer.dispose");
        checkedOut = false;
        shared.dispose();  // уменьшаем ссылку или уничтожаем объект
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("***Error Composer.finalize");
        }
        //        super.finalize();
    }

    @Override
    public String toString() {
        return "Composer{" +
                "id=" + id +
                '}';
    }
}
