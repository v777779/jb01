package ch16.ex01.include;

import lib.utils.BerylliumSphere;

import java.util.Arrays;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nInit of Array Check\n");
        BerylliumSphere[] a;                            // просто ссылка  null типа Array[]

        System.out.println("Empty Array:");
        BerylliumSphere[]b = new BerylliumSphere[5];    // массив готовый но все элементы null
        System.out.println("b:"+ Arrays.toString(b));   // массив ссылок null

        System.out.println("\nInit via for{}:");
        BerylliumSphere[] c = new BerylliumSphere[4];   // новый массив пустой
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                c[i] = new BerylliumSphere();
            }
        }
        System.out.println("c:"+ Arrays.toString(c));   // массив ссылок null

        System.out.println("\nInit via Group Init:");
        BerylliumSphere[] d = new BerylliumSphere[]{
                new BerylliumSphere(),new BerylliumSphere(),
                new BerylliumSphere()
        };   // новый массив пустой
        System.out.println("d:"+ Arrays.toString(d));   // массив ссылок null


        System.out.println("\nDynamic Init via Group Init:");
        a = new BerylliumSphere[]{
                new BerylliumSphere(),new BerylliumSphere()
        };   // новый массив пустой
        System.out.println("a:"+ Arrays.toString(a));   // массив ссылок null

        System.out.println("a.length: "+a.length);
        System.out.println("b.length: "+b.length);
        System.out.println("c.length: "+c.length);
        System.out.println("d.length: "+d.length);
        a=d;
        System.out.println("a.length: "+a.length);

        System.out.println("\nArray of Primitive Types:");
        int[] e;  // null link
        int[] f = new int[5]; // массив int все равны нулю по умолчанию
        System.out.println("f:"+Arrays.toString(f));
        int[] g = new int[4];
        for (int i = 0; i < g.length ; i++) {
            g[i] = i*i;
        }
        int[] h = new int[]{11,15,125};
//        System.out.println("e.length: "+e.length);  // не работает нет инициализации
        System.out.println("f.length: "+f.length);
        System.out.println("g.length: "+g.length);
        System.out.println("h.length: "+h.length);
        e = h; // теперь два объекта ссылаются на массив h[]
        System.out.println("e.length: "+e.length);  // работает как h[]
        e = new int[]{1,2};  // теперь e это новый массив, h остается со старым
        System.out.println("e.length: "+e.length);  // работает как h[]







    }
}
