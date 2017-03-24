package ch12.ex10.retry;

/**
 * Created by V1 on 01-Mar-17.
 */
public class RetryNewEx {
    private void f() throws MEx1 {
        System.out.println("Generate f() MEx1");
        throw new MEx1("f().MEx1_message");
    }
    private void g() throws MEx2 {
        try {
            f();
        } catch (MEx1 e) {
            System.out.println("catched: f() in g() printStackTrace >");
            e.printStackTrace(System.out);
            System.out.println("Generate g() MEx2");
            throw new MEx2("g().MEx2_message");
        }
    }
    public void retryException() {
        try {
            g();
        } catch (MEx2 e) {
            System.out.println("catched: g() in main() printStackTrace >");
            e.printStackTrace(System.out);
        }
    }
}
