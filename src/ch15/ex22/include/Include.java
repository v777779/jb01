package ch.ex22.include;


/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nIFactory2 w Generic Check\n");
        Foo2<Integer> f2Int = new Foo2<>(new IntegerFactory()); // создали класс с объектом Integer через класс обертку
        Foo2<Widget> f2Wid = new Foo2<>(new Widget().new Factory()); // создали класс с объектом Integer через класс обертку

        System.out.println("Integer:"+f2Int.getX());
        System.out.println("Widget :"+f2Wid.getX());

    }
}
