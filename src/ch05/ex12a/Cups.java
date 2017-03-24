package ch05.ex12a;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Cups {
    static int i;
    static Cup cup1;  // нет инициализации
    static Cup cup2;
    static Cup cup4;

    static {
        System.out.println("Cups static {} ");
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }


    public Cups() {
        System.out.println("Cups constructor");
        cup4 = new Cup(4); //некорректное размещение
    }

    static void show() {
        System.out.println("cup1 > "+Cups.cup1+" cup1.i: "+Cups.cup1.i+" cup4 > "+Cups.cup4+" cup4.i :"+Cups.cup4.i);

    }
}
