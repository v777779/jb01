package ch.ex20.local;

import java.lang.reflect.TypeVariable;
import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nErased Type Check\n");

        System.out.println("Erased Type Test1:");
        System.out.println("------------------");
        ErasedType et = new ErasedType();
        ArrayList<String> listT = new ArrayList<>();
        ArrayList<Integer> listV = new ArrayList<>();
        listT.add("str1");
        listV.add(12);
//        listT.add(12); // не работает
//        listV.add("str1");

        boolean cmp = et.compare(new ArrayList<String>(), new ArrayList<Integer>());
        System.out.println("listT:"+listT+" listV:"+listV+" listT<>ListV:"+cmp);
        System.out.println("\nErased Type Test2:");
        System.out.println("------------------");

        List<Frob> list = new ArrayList<Frob>();
        List<Double> list2 = new ArrayList<Double>();
        Map<Frob,Fnorkle> map = new HashMap<>();
        Quark<Fnorkle> quark = new Quark<>();
        Particle<Long,Double> p = new Particle<>();
        Particle<Frob,Fnorkle> p2 = new Particle<>();

        TypeVariable<? extends Class<? extends List>>[] lp = list.getClass().getTypeParameters();
        TypeVariable<? extends Class<? extends List>>[] lp2 = list2.getClass().getTypeParameters();
        TypeVariable<? extends Class<? extends Map>>[] mp = map.getClass().getTypeParameters();
        TypeVariable<? extends Class<? extends Quark>>[] qp = quark.getClass().getTypeParameters();
        TypeVariable<? extends Class<? extends Particle>>[] pp = p.getClass().getTypeParameters();
        TypeVariable<? extends Class<? extends Particle>>[] pp2 = p2.getClass().getTypeParameters();

        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(list2.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p2.getClass().getTypeParameters()));




    }
}
