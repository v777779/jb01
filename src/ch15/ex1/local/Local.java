package ch.ex1.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nObject Type Check\n");
        System.out.println("Holder1 Fixed Type Class:");
        Holder1 h1 = new Holder1(new Auto());
        System.out.println(h1.getA());
        System.out.println("\nHolder2 Object Type Class:");
        Holder2 h2 = new Holder2(new Auto());   // упаковка в Object
        Auto a = (Auto)h2.getA();
        h2.setA("String Auto");
        String s = (String)h2.getA();
        h2.setA(120);                           // автоупаковка
        Integer i = (Integer)h2.getA();
        System.out.println("a:"+a+" s:"+s+" i:"+i);
        System.out.println("\nTwoTuple Generic Type Class:");
        Holder3 <Auto> h3 = new Holder3<>(new Auto());
        Auto a3 = h3.getA();
        System.out.println("a3:"+a3);
//        h3.setA("String3");     // не проходит
//        h3.setA(120);           // не проходит


    }
}
