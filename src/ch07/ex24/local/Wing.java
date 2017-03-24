package ch07.ex24.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Wing extends Beetle {
    private int t = getStatic(34,"Wing.private.k");             //  инициализация в строке объявления
    private int u;
    private static int x4 = getStatic(75,"Wing.private.static.x4");    //
    private static int x5;

    static{
        x5 = 127;  // инициализация в блоке
        System.out.println("Wing.block.private.static.x5."+x5);
    }
    {
        u = getStatic(71,"Wing.block.private.n");  // закрытая своя переменная
    }

    public Wing() {
        super(); // вызов конструктора предка
        System.out.print("Wing.Constructor ");
        System.out.print("k = " + t);
        System.out.println(" j = " + j);

    }

    public static void getWingX4() {
        System.out.println("x4 = " + x4);
    }

    public static void getWingX5() {
        System.out.println("x5 = " + x5);
    }

}
