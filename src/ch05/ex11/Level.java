package ch05.ex11;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Level {

    public Level() {
        System.out.println("Level object created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Method Finalize called");
        super.finalize();
    }
}
