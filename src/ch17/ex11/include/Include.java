package ch17.ex11.include;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nPriorityQueue Check\n");
        PQList pqList = new PQList();
        pqList.add("Empty trash",'C',4);
        pqList.add("Feed dog",'A',2);
        pqList.add("Feedy bird",'B',7);
        pqList.add("Mow lawn",'C',3);
        pqList.add("Water lawn",'A',1);
        pqList.add("Feed Cat",'B',1);

        while (!pqList.isEmpty()) {
            System.out.println(pqList.remove());
        }

    }
}