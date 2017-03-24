package ch07.ex23.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Beetle extends Insect {
    private int k = getStatic(34,"Beetle.private.k");             //  инициализация в строке объявления
    private int n;
    private static int x2 = getStatic(75,"Beetle.private.static.x2");    //
    private static int x3;

    static{
        x3 = 127;  // инициализация в блоке
        System.out.println("Beetle.block.private.static.x3."+x3);
    }
    {
        n = getStatic(71,"Beetle.block.private.n");  // закрытая своя переменная
    }

    public Beetle() {
        System.out.print("Beetle.Constructor ");
        System.out.print("k = " + k);
        System.out.println(" j = " + j);
    }


}
