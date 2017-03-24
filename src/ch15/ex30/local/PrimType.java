package ch15.ex30.local;

import lib.utils.IGenerator;

import java.util.*;

/**
 * Created by V1 on 21.03.2017.
 */
public class PrimType {
    public void appListInt() {
        System.out.println("ArrayList of <int>:");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i); // автоупаковка
        }

        for (Integer integer : list) {
            System.out.print(integer + " "); // авто распаковка
        }
        System.out.println();
    }

    public void appSetByte() {
        System.out.println("Set of <byte>:");
        Byte[] bytes = new Byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Set<Byte> hset = new HashSet<>(Arrays.asList(bytes));

        for (Byte nByte : hset) {
            System.out.print(nByte + " "); // авто распаковка
        }
        System.out.println();
    }

    <T> T[] fill(T[] array, IGenerator<T> gen) {
        for (int i = 0; i < array.length; i++) {
           array[i] = gen.next();
        }
        return array;
    }

    class RandInt implements IGenerator<Integer> {
        Random rnd = new Random();
        @Override
        public Integer next() {
            return rnd.nextInt(100);
        }
    }

    class RandString implements IGenerator<String> {
        Random rnd = new Random();
        char[] chs = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        @Override
        public String next() {
            String s ="";
            for (int i = 0; i < 10 ; i++) {
                s += chs[rnd.nextInt(chs.length)];
            }
            return s;
        }
    }


    public void appArrayInt() {
//        System.out.println("Array of <int>:");
//        int[] intA = new int[10];
//        int[] ints = fill(intA,new RandInt());  // generic не поддерживают <T> для primitive
//        for (Integer anInt : ints) {
//            System.out.print(anInt+" ");
//        }
//        System.out.println();
    }

    public void appArrayInteger() {
        System.out.println("Array of <Integer>:");
        Integer[] ints = fill(new Integer[10],new RandInt());  // generic не поддерживают <T> для primitive
        for (Integer anInt : ints) {
            System.out.print(anInt+" ");
        }
        System.out.println();
    }

    public void appArrayString() {
        System.out.println("Array of <String>:");
        String[] strings = fill(new String[10],new RandString());  // generic не поддерживают <T> для primitive
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println();
    }

    public <T> T[] getArrInt(T[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (T)new Integer(rnd.nextInt(100));
        }
        return array;
    }



}
