package ch08.ex11.access;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Insect {
    private int i = getStatic(9,"Insect.int.i");  // закрытая своя переменная
    private int m;
    protected int j;    // наследуемая
    private static int x1 = getStatic(12, "Insect.private.static.x1");  // инициализация
    private static int x2;

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
        j = getStatic(7,"Insect.Constructor.j");
//        System.out.println("Insect.Constructor i = " + i + ", j = " + j);
    }
}
