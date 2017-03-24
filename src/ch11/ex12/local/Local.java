package ch11.ex12.local;

import ch11.ex10.rodent.Rodent;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nList Iterator Check\n");
        List<Rodent> rodents = Rodent.arrayList(7);
        ListIterator<Rodent> it = rodents.listIterator();

        System.out.println("ListIterator Forward direction:");
        while (it.hasNext()) {
            System.out.print(it.next()+","+it.previousIndex()+","+it.nextIndex()+"; ");
        }

        System.out.println("\n\nListIterator Backward direction:");
        while (it.hasPrevious()) {   // крутим обратно, т.к. он в конце из за предыдущего цикла
            System.out.print(it.previous()+","+it.previousIndex()+","+it.nextIndex()+"; ");
        }

        System.out.println("\n\nArrayList Raw:");
        System.out.println(rodents);

        it = rodents.listIterator(3); // встать на позицию
        while (it.hasNext()) {
            it.next(); // встать на конкретный объект
            it.set(Rodent.randomRodent());  // тоже самое Rodent.next()
        }
        System.out.println("\nArrayList Set(3..n) Raw:");
        System.out.println(rodents);


        System.out.println("\nArrayList Clamp\n");
        List<Clamp> cl = Clamp.getList(12); // 12 elements
        ListIterator<Clamp> itClamp = cl.listIterator();

        while (itClamp.hasNext()) {

            Clamp clamp = itClamp.next();
            System.out.printf("clamp: %12s.%-2d  it.prevI(): %-2d   it.nextI: %-2d  hasPrev: %-6s \n",
                    clamp.name,clamp.code,itClamp.previousIndex(),
                    itClamp.nextIndex(),itClamp.hasPrevious(),itClamp.hasPrevious());
        }


    }
}
