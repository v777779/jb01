package ch15.ex09.local;

/**
 * Created by V1 on 15.03.2017.
 */
public class GMet {
    private int count = 0;
    public <T> void getT( T x) {
        System.out.println(count+++"."+x.getClass().getSimpleName());
    }

}
