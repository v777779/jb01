package ch11.ex12a.local;

import ch11.ex10.rodent.Rodent;

import java.util.LinkedList;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {

    public static void sleep() {
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\n  Check\n");
        LinkedList<Rodent> rodents = new LinkedList<>(Rodent.arrayList(7));
        System.out.println(rodents);
        System.out.println("___Get First Element___");
        System.out.println("getFirst()>" + rodents.getFirst());  // первый элемент, > exception
        System.out.println(" element()>" + rodents.element());   // надстройка над getFirst() > exception
        System.out.println("    peek()>" + rodents.peek());      // тоже самое > null
        System.out.println(" peekLast()>" + rodents.peekLast()); // тоже самое > null но последний элемент
        System.out.println(rodents.get(1));                      // по индексу > exception

        System.out.println("___Remove and Return First Element___");  // удаление и выдача первого элемента
        System.out.println(rodents);
        System.out.println("     poll()>" + rodents.poll());          // first  > null
        System.out.println(rodents);
        System.out.println("removeFirst()>" + rodents.removeFirst()); // first  >exception
        System.out.println(rodents);
        System.out.println("  remove()>" + rodents.remove());         // надстройка getFirst > exception

        System.out.println(rodents);
        System.out.println(" removeLast()>" + rodents.removeLast());  // удалить последний элемент > exception
        System.out.println(rodents);

        System.out.println("___Add Element___");                      // добавление элемента
        System.out.println(rodents);
        rodents.addFirst(Rodent.next());
        System.out.println("addFirst()>"+rodents);                    // at first position

        rodents.offer(Rodent.next());
        System.out.println("   offer()>"+rodents);                    // at last position
        rodents.add(Rodent.next());
        System.out.println("     add()>"+rodents );                   // at last position
        rodents.addLast(Rodent.next());
        System.out.println(" addLast()>"+rodents );                   // at last position

    }
}
