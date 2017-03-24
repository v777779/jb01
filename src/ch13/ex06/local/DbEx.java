package ch13.ex06.local;

/**
 * Created by V1 on 06-Mar-17.
 */
public class DbEx extends Exception {
    public DbEx(int tId, int qId, String msg) {   // messag version
        super(String.format("(t%d, q%d) %s",tId,qId,msg));  // String упакована внутри т.к. super() в 1й строке
    }
}
