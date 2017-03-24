package ch.ex10.access;

/**
 * Created by V1 on 15.03.2017.
 */
public class GMetK {
    private static int count = 0;
    public static <T,U> void getT( T x,U y, Integer z) {
        System.out.println(count+++"."+x.getClass().getSimpleName()+" "+
                y.getClass().getSimpleName()+" "+
                z.getClass().getSimpleName()+" ");
    }

}
