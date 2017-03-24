package ch07.ex19;

import java.util.Random;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Flower extends Plant{
    static Random rnd = new Random();
    String s;
    final int i;
    final int p = 1; // инициализация в строке
    final int q;
    final static int m = rnd.nextInt(100); // инициализация в строке
    final static int nStatic = 1; // инициализация в строке
    final static int mStatic;
    int j;

    static{
        mStatic = 2;    // инициализация в блоке static
    }

    {
        q = 2;         // инициализация в обычном блоке
    }
    public Flower() {
         i = 27; // инициализация в конструкторе константой
        System.out.println("Flower.Flower() "+i);

    }

    public Flower(String s, int i, int j) {

        this.s = s;
        this.i = i; // инициализация в конструкторе по парамтрам
        this.j = j;
        System.out.println("Flower.Flower(s,i,j) "+i);
    }

    public Flower(String s) {

        i = 15;
        this.s = s;
        System.out.println("Flower.Flower(s) "+i);

    }

    public Flower(int i) {

        this.i = i;
        System.out.println("Flower.Flower(i) "+i);
    }


     void getLeaf() {
        final String sTemp;
        String [] colors = new String[] { "green ","yellow","red   ","brown "};
        final int k = rnd.nextInt(100);         // в строке объявления
        final Leaf leafG = new Leaf("green");    // в строке объявления
        final Leaf leafY = new Leaf( colors[rnd.nextInt(4)]);
//        leafY = leafG; // не работает
        final Leaf leafN;  // объявление final без инициализации
        int i;
         sTemp = "temp: "+rnd.nextInt(35);
        System.out.print(this.s+" k=" + k+" leafG:"+leafG + " leafY:"+leafY+" " );
        i = k+1;
        leafN = new Leaf("noColor");  // инициализация в другом месте
        System.out.println(" i="+i+" leafN:" +leafN + " "+sTemp);
    }

    void getLeaf( final int i) {
        final String sTemp = "gold leaf";
        System.out.println("final sTemp:" + sTemp+ " input i: "+i);
//        i = 12; // не пропускает

    }

    void getLeaf(final Leaf leaf) {
        final String sTemp = "gold leaf";
        System.out.println("final sTemp:" + sTemp+ " input Leaf: "+leaf);

        Leaf leaf1 = new Leaf("nLeaf");
//          leaf = leaf1; // не пропускает
    }

//      void getGrow() {  // невозможно так как метод final
//
//      }

    void getOpen() {
        System.out.println("Flower.getOpen"+this);
    }



    @Override
    public String toString() {
        return "Flower."+s;
    }
}
