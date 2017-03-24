package ch07.ex8;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Stream extends Game {


    public Stream(int i) {  // non default constructor
        super(i);
    }

    public Stream() {  // default but changed constructor
        super(1);
    }

    @Override
    public String toString() {
        return (super.toString() + " Stream " );
    }
}
