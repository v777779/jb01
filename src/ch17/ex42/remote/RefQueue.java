package ch17.ex42.remote;

import java.lang.ref.*;
import java.util.LinkedList;

/**
 * Created by V1 on 04-Apr-17.
 */
public class RefQueue {
    private static ReferenceQueue<VeryBig> rq = new ReferenceQueue<>(); // создали очередь для включения

    public static boolean checkQueue() {
        Reference<? extends VeryBig> inQueue = rq.poll();
        if (inQueue != null) {
            System.out.println(inQueue.get());  // вывести состояние очереди ?
            return true;
        }
        return false;
    }

    public static void check() {
        int size = 10;
        System.out.println("SoftReference:");
        LinkedList<SoftReference<VeryBig>> sList = new LinkedList<>(); // список объектов SoftReference
        for (int i = 0; i < size; i++) {
            sList.add(new SoftReference<VeryBig>(new VeryBig("Soft." + i))); // добавить реальные объекты с idName
            System.out.println("created:" + sList.getLast());
            checkQueue(); // проверка очереди на удаление ссылок
        }

        System.out.println("\nWeakReference:");
        LinkedList<WeakReference<VeryBig>> wList = new LinkedList<>(); // список объектов SoftReference
        for (int i = 0; i < size; i++) {
            wList.add(new WeakReference<VeryBig>(new VeryBig("Weak." + i))); // добавить реальные объекты с idName
            System.out.println("created:" + wList.getLast()+" <> "+wList.getLast().get());
            checkQueue(); // проверка очереди на удаление ссылок
        }

        SoftReference<VeryBig> soft = new SoftReference<>(new VeryBig("SoftAlone"));
        WeakReference<VeryBig> weak = new WeakReference<>(new VeryBig("WeakAlone"));

        System.out.println("GC Phantom:");
        System.gc(); // удаление Weak ссылок

        System.out.println("\nPhantomReference:");
        LinkedList<PhantomReference<VeryBig>> pList = new LinkedList<>(); // список объектов SoftReference
        for (int i = 0; i < size; i++) {
            pList.add(new PhantomReference<>(new VeryBig("Phant." + i), rq)); // добавить реальные объекты с idName
            System.out.println("created:" + pList.getLast());
            checkQueue(); // проверка очереди на удаление ссылок
        }

        System.gc(); // удаление Phantom ссылок

        System.out.println("\nWeakReference after GC:");  // проверка weak ссылок после удаления
        for (WeakReference<VeryBig> w : wList) {
            System.out.println("check:" + w+" <> "+w.get());
        }

        System.out.println("\nPhantomReference after GC:");  // проверка weak ссылок после удаления
        for (PhantomReference<VeryBig> p : pList) {
            System.out.println("check:" + p+" <> "+p.get());
        }

    }
}
