package ch12.ex10.access;

/**
 * Created by V1 on 02-Mar-17.
 */
public class MyExClass {
    public void f() throws MyExTwo{
        try {
            g();
        } catch (MyExOne e) {
            System.out.println("catch:"+e);
            throw new MyExTwo();
        }


    }

    private void g() throws MyExOne {
        throw new MyExOne();
    }


}
