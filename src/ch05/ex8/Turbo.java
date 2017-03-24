package ch05.ex8;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Turbo {
   int i;
   int m;
   String s;

    public Turbo(String s) {
        this.s = s;
        System.out.println("String Constructor");
    }

    public Turbo(int i) {
        this("String init");                    // только 1 конструктор и только в 1й строке
        this.i = i;                               // class i и local i
        System.out.println("Int Constructor");
    }

    public Turbo() {
        this(1); // конструктор Int
        this.m = 1;
        System.out.println("Default Constructor");
    }

    Turbo getInstance(int i) {
        this.i = i;
        return (this);
    }

    Turbo getIcrement() {
        this.i++;
        System.out.println("Turbo increment "+i);
        return (this);
    }

}
