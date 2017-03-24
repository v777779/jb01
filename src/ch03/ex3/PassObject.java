package ch03.ex3;

/**
 * Created by V1 on 03-Feb-17.
 */
public class PassObject {
Letter xField;

    public PassObject() {
        xField =  new Letter();
    }

    void f(Letter y) {  // передали объект по ссылке
        y.c = 'z'; 	    // объект изменяется вот тот оригинальный Letter x
        y = xField;     // это поле не работает, да мы имеем дело с копией, т.к. y=b > y=c не означает что b=c
    }

    void passMethod() {
        Letter x = new Letter();
         x.c = 'a';
         xField.c = 'b';
        System.out.println("x.c = a > x.c: "+x.c);
        f(x);
        System.out.println("f(x)    > x.c: "+x.c);


    }



}
