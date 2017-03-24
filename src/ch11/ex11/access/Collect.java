package ch11.ex11.access;

import ch11.ex10.rodent.Rodent;

import java.util.*;

/**
 * Created by V1 on 21-Feb-17.
 */
public class Collect {
    ArrayList<String>   aList = new ArrayList<>(Arrays.asList( "Heavy","Link", "Word", "Stall","Get","Lion","Auto" ));
    LinkedList<Integer> lList = new LinkedList<>(Arrays.asList( 120,21,75,93,32,567,7756,32,1,56,91));
    HashSet<Rodent>     hSet =  new HashSet<>(Rodent.arrayList(8)); // набить объектами сразу List
    TreeSet<Ball>       tSet =  new TreeSet<>(Arrays.asList(Ball.getBalls(new Ball[12])));

    void show(Iterator it) {
        while (it.hasNext()) {
            System.out.print(it.next().toString()+" ");
        }
        System.out.println();
    }
}
