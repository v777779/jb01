package ch08.ex12a.local;

/**
 * Created by V1 on 10-Feb-17.
 */
public abstract class Singer {
    private static long counter = 0;   // Class level
    private final long id = counter++; // Fixed ID of instance of parent class

    public Singer() {
        System.out.println("Singer.Constructor");
    }

    protected long getId() {     // request ID from Parent Class
      return  Singer.counter;
    }
    protected abstract void addRef();

    protected void dispose() {
        System.out.println("Singer.dispose.Id."+id);
    }

    @Override
    public String toString() {
        return "Singer{" +
                "id=" + id +
                '}';
    }
}
