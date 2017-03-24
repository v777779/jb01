package ch03.ex05;

/**
 * Created by V1 on 04-Feb-17.
 */
public class Ex5 {
    public static void main(String[] args) {
        Integer i1 = new Integer(5);
        Integer i2 = new Integer(5);

        Object o = new Object();
        Object o1 = new Object();
        Object o2 = o1;  // объект не создается, только ссылка

        System.out.println("сравнение по ссылке Object  o == o1       > "+(o==o1));
        System.out.println("сравнение по ссылке Object  o.equals(o1)  > "+o.equals(o1));
        System.out.println("сравнение по ссылке Object  o1 == o2      > "+(o1==o2));
        System.out.println("сравнение по ссылке Object  o1.equals(o2) > "+o1.equals(o2));

        System.out.println("сравнение по ссылке > i1==i2        "+ (i1==i2));
        System.out.println("сравнение по equals > i1.equals(i2) "+ i1.equals(i2));


        System.out.println("\n\nClass Value Integer \n");
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = 100;
        v2.i = 100;
        System.out.println("v1==v2        > "+(v1==v2));
        System.out.println("v1.equals(v2) > "+v1.equals(v2));

        System.out.println();
        System.out.println("\n\nClass ValueNew with equals redefined\n");
        Value v3 = new ValueNew();  // полиморфизм
        Value v4 = new ValueNew();
        v3.i = 100;
        v4.i = 100;
        System.out.println("v3==v4        > "+(v3==v4));
        System.out.println("v3.equals(v4) > "+v3.equals(v4));

//! comment for testing
        System.out.println("\n\n Logical operators \n");
        System.out.println(" "+(!true) + " "+ (!false) + " "+ (false != true)+ " "+ (true != true) );
        System.out.println(" "+(~0) + " "+ (!false) + " "+ (false != true)+ " "+ (true != true) );

    }
}
