package ch17.ex7.local;

import lib.container.Countries;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by V1 on 3/28/2017.
 */
public class ListMethods {
    private static boolean bFlag;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;
    private static List<String> list;

    private static void p(String s, Object o) {
        System.out.println(s + ":" + o);
    }

    private static void pb() {
        System.out.println("bFlag:" + bFlag);
    }

    private static void pi() {
        System.out.println("i:" + i);
    }

    private static void ps() {
        System.out.println("s:" + s);
    }

    private static void pl() {
        System.out.println("list:" + list);
    }


    public static void listCheck(List<String> list) {
        ListMethods.list = list;

        System.out.println("ArrayList<> check:");

        list.add(1, "Counter");            // добавить на первую позицию элемент
        list.add("mPair");                            // добавить в конец элемент
        p("list", list);
        list.addAll(Countries.names(5));         // добавить в конец группу
        list.addAll(3, Countries.names(5)); // в позицию 3 добавить группу
        pl();
        bFlag = list.contains("Link");     // наличие элемента
        pb();
        bFlag = list.containsAll(Countries.names(5));    // наличие группы
        pb();
        s = list.get(1);                   // получить элемент с 1й позиции
        ps();
        i = list.indexOf("mPair");         // получить индекс элемента
        pi();
        bFlag = list.isEmpty();            // пустой ли список
        pb();
        it = list.iterator();              // обычный Iterator{}
        lit = list.listIterator();         // ListIterator{}
        i = list.lastIndexOf("BENIN");  // последнее вхождение
        pi();
        list.remove(1);    // удалить по индексу
        pl();
        list.remove("A");    // удалить по значению
        pl();
        list.set(1, "Gamma");   // задать по индексу и значению
        pl();
        list.retainAll(Countries.names(5)); //оставить только список аргумента
        pl();
        list.removeAll(Countries.names(5)); // удалить все вхождения списка аргумента
        pl();
        i = list.size();        // размер
        pi();
        list.clear();           // очистить
        pl();
    }

    public static void iterMotion(List<String> list) {
        ListMethods.list = list;

        System.out.println("\nArrayList<> Iterator:");
        ListIterator<String> lit = list.listIterator();
        bFlag = lit.hasNext();
        pb();
        bFlag = lit.hasPrevious();
        s = lit.next();
        ps();
        i = lit.nextIndex();
        pi();
        s = lit.previous();
        ps();
        i = lit.previousIndex();
        pi();
    }

    public static void iterAction(List<String> list) {
        ListMethods.list = list;

        System.out.println("\nArrayList<> Iterator:");
        ListIterator<String> lit = list.listIterator();
        pl();
        lit.add("GreenRose");
        pl();
        lit.next();
        lit.remove();
        lit.next();
        lit.set("StartPoint");
        pl();
    }

    public static void checkVisual(List<String> list) {
        ListMethods.list = list;

        System.out.println("\nArrayList<> Visual:");
        pl();
        List<String> bList = Countries.names(5);
        p("bList", bList);
        list.addAll(bList);
        list.addAll(bList);
        pl();
        ListIterator<String> lit = list.listIterator(list.size() / 2); // встать на середину списка
        lit.add("OneString");  // добавляет прямо в список list с позиции  size/2
        pl();
        p("lit.next()", lit.next()); // точно по списку
        lit.remove(); // удалило следюущую за "OneString" позицию, все четко
        pl();
        lit.next();  // BOTSWANA
        lit.set("TwoCheck");  // заменили BOTSWANA на TwoCheck
        pl();
        lit = list.listIterator(list.size()); // встать в конец списка
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " "); // прогнать в обратном порядке
        }
        System.out.println();
        System.out.println("finished...");
    }

    public static void checkLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        ListMethods.list = list;
        System.out.println("\nLinkedList<> Methods:");



        list.addAll(Countries.names(15));  // заполнить список
        pl();
        list.addFirst("FirstFight");
        p("addFirst()   ",list);
        list.addFirst("SecondStrike");
        p("addFirst()   ",list);
        p("getFirst()   ",list.getFirst());
        p("after        ",list);
        list.removeFirst();
        p("removeFirst()",list);
        list.removeFirst();
        p("removeFirst()",list);
        list.removeLast();
        p("removeLast() ",list);

    }
}
