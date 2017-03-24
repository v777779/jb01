package ch.ex9.access;

/**
 * Created by V1 on 15.03.2017.
 */
public class GMetN {
    private static int count = 0;
    public static <T,U,V> void getT( T x,U y, V z) {
        System.out.println(count+++"."+x.getClass().getSimpleName()+" "+
                y.getClass().getSimpleName()+" "+
                z.getClass().getSimpleName()+" ");
    }

}
