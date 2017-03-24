package ch07.ex15.local;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Villian {
    private String name;

    protected void set(String name) {  // access by child objects
        this.name = name;
    }

    public Villian(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ("Object Villian name: "+name);
    }
}
