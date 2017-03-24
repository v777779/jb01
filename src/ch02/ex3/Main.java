package ch02.ex3;

import ch02.ex2.Circle;
import ch02.ex2.Shape;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by V1 on 02-Feb-17.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        List<Shape> aList = new ArrayList();
        List<String> bList = new LinkedList();

        arrayList.add("string");
        arrayList.add(12);
        arrayList.add(23.43);
        arrayList.add(new Circle());
        arrayList.add(new Shape());
        arrayList.add('C');


        for (Object o : arrayList) {
            System.out.println(o);
        }

        aList.add(new Shape());
        aList.add(new Circle());
//        aList.add("hello");
//        aList.add("jimmy");
//        aList.add(12);
        bList.add("hello");
        bList.add("jimmy");
//        bList.add(new Shape());
//        bList.add(new Circle());
//        bList.add(12);
        for (Shape a : aList) {
            System.out.println(a);
        }
        for (String s : bList) {
            System.out.println(s);
        }
    }
}
