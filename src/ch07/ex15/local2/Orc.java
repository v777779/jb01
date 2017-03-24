package ch07.ex15.local2;

import ch07.ex15.local.Villian;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Orc extends Villian{  // access to public Villian
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);                // access to public Villian.constructor
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        set(name); // access to protected
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return ("Orc "+orcNumber+ ": "+super.toString());
    }
}
