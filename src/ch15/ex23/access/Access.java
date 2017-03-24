package ch.ex23.access;


/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 23 Check\n");


        Foo2<Integer,Integer> f2Int = new Foo2<>(new IntegerFactory(), 125);
        Foo2<Widget, String> f2Wid = new Foo2<>( new Widget.Factory(),"green");

        System.out.println("Integer:"+f2Int.getX());
        System.out.println("Widget :"+f2Wid.getX());

    }
}
