package hw.vpex.arrays.dblink;

import java.util.Random;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class DoublyLinkedList {

    private Link first;
    private Link last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean IsEmpty() {
        return first == null;
    }

    //метод, вставляющий элемент в конец списка
    public void InsertLast(int dd) {
        Link newLink = new Link(dd);
        if (IsEmpty())
            first = newLink;
        else {
            last.next = newLink;
            newLink.prev = last;
        }
        last = newLink;
    }

    public void InsertLast(Link newLink) {
        if (IsEmpty())
            first = newLink;
        else {
            last.next = newLink;
            newLink.prev = last;
        }
        last = newLink;
    }

    //метод удаляющий первое вхождение переменной key
    public Link deleteKey(int key) {
        Link current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null)
                return null; //такий елемент не знайдений
        }

        if (current == first) //знайдений, перший вузол
            first = current.next;
        else
            current.prev.next = current.next;
        if (current == last) // останній вузол?
            last = current.prev;
        else
            // not last
            current.next.prev = current.prev;
        return current; // return value
    }

    public DoublyLinkedList clone() {
        DoublyLinkedList list = new DoublyLinkedList(); //новый список
        Link link = this.first;

        while (true) {
            list.InsertLast(link.getKey());
            if (link == last) {
                break;
            }
            link = link.next;
        }
        return list;
    }

    public DoublyLinkedList removeDoubles() {
        DoublyLinkedList sList = this.clone(); //клонируем
        DoublyLinkedList dList = new DoublyLinkedList(); //новый список

        while (true) {
            int key = sList.first.getKey();
            while (!sList.IsEmpty() && sList.deleteKey(key) != null) { // удалять все похожие элементы
            }
            dList.InsertLast(key);
            if (sList.IsEmpty()) { // закончили
                break;
            }
        }
        return dList; // return dList
    }

    //метод выводит на экран

    public void DisplayForward() {
        System.out.print("Список:");
        Link current = first;
        while (current != null) {
            current.DisplayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Random r = new Random();
        int n = r.nextInt(20) + 10;
        int k = 0;
        for (int i = 0; i < n; i++) {
            list.InsertLast(r.nextInt(20) - 10);
            k++;
        }
        list.DisplayForward();

        System.out.println("Удаляем все лишнее");
        list = list.removeDoubles();
        list.DisplayForward();
    }

}
