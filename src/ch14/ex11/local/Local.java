package ch14.ex11.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nLiteral .class Check\n");
        Class initable = Initable.class;  // обращение к классу где есть статический метод
        System.out.println("class: after Initable");
        Class initable2 = Initable2.class;
        System.out.println("class: after Initable2");
        Class initable3 = Initable3.class;
        System.out.println("class: after Initable3");
        System.out.println("----------------------");
        System.out.println("Initable.staticFinal                :"+Initable.staticFinal);
        System.out.println("Initable.staticFinal2(method)       :"+Initable.staticFinal2);
        System.out.println("Initable2.staticNonFinal(non final) :"+Initable2.staticNonFinal);
        System.out.println("Initable3.staticNonFinal(non final) :"+Initable3.staticNonFinal);

    }
}
