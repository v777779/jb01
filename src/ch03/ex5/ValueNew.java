package ch03.ex5;

/**
 * Created by V1 on 04-Feb-17.
 */
public class ValueNew extends Value {


    @Override
    public boolean equals(Object obj) {
        try {

            if (this.i == ((Value)obj).i) { // cast of object
                return true;
            }
        } catch (Exception e) {
            System.out.println("catch03.executed");
        }
        return false;
    }

}
