package ch08.ex12a.local;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Composer {
    private Shared shared; // просто ссылка

    private int refcount = 0;
    private static long counter = 0;   // Class level
    private final long id = counter++; // Fixed ID of instance

    public Composer(Shared shared) {
        System.out.println("Composer.Constructor");
        this.shared = shared;
        this.shared.addRef();  // нарастили ссылку
    }

    protected void dispose() {
        System.out.println("Composer.dispose");
        shared.dispose();  // уменьшаем ссылку или уничтожаем объект
    }

    @Override
    public String toString() {
        return "Composer{" +
                "id=" + id +
                '}';
    }
}
