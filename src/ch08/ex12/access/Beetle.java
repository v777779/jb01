package ch08.ex12.access;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Beetle extends Insect {
    private int k = getStatic(34,"Beetle.private.k");             //  инициализация в строке объявления
    private int n;
    private static int x2 = getStatic(75,"Beetle.private.static.x2");    //
    private static int x3;
    private Characteristic p = new Characteristic("Beetle Characteristic");
    private Description t = new Description("Beetle Description");

    static{
        x3 = 127;  // инициализация в блоке
        System.out.println("Beetle.block.private.static.x3."+x3);
    }
    {
        n = getStatic(71,"Beetle.block.private.n");  // закрытая своя переменная
    }

    public Beetle() {
        System.out.println("Beetle.Constructor ");
    }

    protected void dispose() {
        t.dispose();
        p.dispose();
        System.out.println("Beetle.dispose");
        super.dispose();
    }

}
