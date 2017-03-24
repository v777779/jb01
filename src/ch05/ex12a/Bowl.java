package ch05.ex12a;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Bowl {
    public Bowl(int marker) {  // конструктор выводит любой Bowl
        System.out.println("Bowl(" + marker + ")");
    }

    static void getInfo() {
        System.out.println("Bowl getInfo called");
    }

    void fBowl(int marker) {
        System.out.println("fBowl(" + marker + ")");
    }
}



