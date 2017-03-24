package ch.ex2;

/**
 * Created by V1 on 03-Feb-17.
 */


public class Assignment {
Tank t1;
Tank t2;
TankFloat f1;
TankFloat f2;

    public Assignment() {
        t1 =  new Tank();
        t2 =  new Tank();
        f1 =  new TankFloat();
        f2 =  new TankFloat();
    }

    public void showInt(String s) {
        System.out.print(s);
        System.out.println("1: t1.level:"+t1.level+"\tt2.level:"+t2.level);
    }
    public void showFloat(String s) {
        System.out.print(s);
        System.out.println("1: f1.level:"+f1.level+"\tf2.level:"+f2.level);
    }

    public void assyInt() {

        System.out.println("Integer Class Name Coinside demo\n");

        t1.level = 9;
        t2.level = 47;

        showInt("");

        t1.level = t2.level;  // присвоение примитивных типов
        showInt("t1.level = t2.level \t\t");

        t1.level = 19;
        t2.level = 45;
        showInt("t1.level=19 t2.level=45\t\t");

        t1 = t2;                    // перезапись ссылок, обе ссылки указывают на t2
        showInt("t1 = t2\t\t\t\t\t\t");

        t1.level = 21;              // изменит значение на 21 и обе ссылки покажут 21
        showInt("t1.level = 21\t\t\t\t");

        t2.level = 32;
        showInt("t2.level = 32\t\t\t\t");
        System.out.println();

    }

    public void assyFloat() {
        System.out.println("Float Class Name Coinside demo\n");

        f1.level = 9.33f;
        f2.level = 47.48f;

        showFloat("");

        f1.level = f2.level;  // присвоение примитивных типов
        showFloat("f1.level = f2.level \t\t\t\t");

        f1.level = 19.46f;
        f2.level = 45.52f;
        showFloat("f1.level=19.46 f2.level=45.52\t\t");

        f1 = f2;                        // перезапись ссылок, обе ссылки указывают на t2
        showFloat("f1 = f2\t\t\t\t\t\t\t\t");

        f1.level = 21.12f;              // изменит значение на 21 и обе ссылки покажут 21
        showFloat("f1.level = 21.12\t\t\t\t\t");

        f2.level = 32.32f;
        showFloat("f2.level = 32.32\t\t\t\t\t");

    }

}
