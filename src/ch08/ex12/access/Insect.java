package ch08.ex12.access;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Insect {
    private int i = getStatic(9,"Insect.int.i");  // закрытая своя переменная
    private int m;
    protected int j;    // наследуемая
    private static int x1 = getStatic(12, "Insect.private.static.x1");  // инициализация
    private static int x2;
    private Characteristic p = new Characteristic("Insect Characteristic");
    private Description t = new Description("Insect Description");
    private Characteristic p2;
    private Description t2;

    static{
        x2 = 25;
        System.out.println("Insect.block.private.static.x2 = " + x2);
    }
    {
        m =  getStatic(39,"Insect.block.private.m");  // закрытая своя переменная
    }

    static int getStatic(int value, String s) {
        System.out.println(s+" = " + value);
        return value;
    }


    public Insect() {
        p2 = new Characteristic("Insect Characteristic2");
        t2 = new Description("Insect Description2");

        j = getStatic(7,"Insect.Constructor.j");
    }

    protected void dispose() {
        t2.dispose();
        p2.dispose();
        t.dispose();
        p.dispose();
        System.out.println("Insect.dispose");
    }
}
