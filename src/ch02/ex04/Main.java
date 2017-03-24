package ch02.ex04;

/**
 * Created by V1 on 02-Feb-17.
 */
public class Main {
    public static void main(String[] args) {
        Prim prim = new Prim();
        prim.show();

        Stat stat = new Stat();
        Stat stat1 = new Stat();

        System.out.println("Stat.stat: "+ Stat.stat);
        System.out.println("stat:\t"+ stat+"\tstat.stat: \t"+ Stat.stat);
        System.out.println("stat1:\t"+ stat1+"\tstat1.stat:\t"+ Stat.stat);

        System.out.println("Abstract class methods");
        AStat.show();
        ANew  aNew = new ANew();
        ANew.show();  // overrides abstract method


    }
}
