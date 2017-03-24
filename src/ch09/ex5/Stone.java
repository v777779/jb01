package ch.ex5;

/**
 * Created by V1 on 12-Feb-17.
 */
public class Stone implements Treat {
    @Override
    public void thrown() {
        System.out.println("Stone.thrown");
    }

    @Override
    public void up() {
        System.out.println("Stone.up");
    }

    @Override
    public void down() {
        System.out.println("Stone.down");
    }

    @Override
    public void move() {
//        Treat.i = 15;     // не работает, Interface fields  final static
        System.out.println("Stone.move");
    }

    @Override
    public String toString() {
        return "Stone{}."+" Interface {s."+s+
               ", i."+i +"}" ;
    }
}
