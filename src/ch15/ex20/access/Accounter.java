package ch15.ex20.access;

/**
 * Created by V1 on 17.03.2017.
 */
public class Accounter implements ICount {
    @Override
    public void setcount() {
        System.out.println("Accounter.setcount");
    }

    @Override
    public void getcount() {
        System.out.println("Accounter.getcount");
    }

    public void getbalance() {
        System.out.println("Accounter.getbalance");
    }
}
