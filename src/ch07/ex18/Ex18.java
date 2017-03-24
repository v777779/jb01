package ch07.ex18;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Ex18 {
    public static void main(String[] args) {
        Table table = new Table();
        Table table2 = new Table();
        Leg newLeg = new Leg(5);
        Desk newDesk = new Desk();
        System.out.println("table = " + table);
        table.legs[2] = newLeg;
        System.out.println("table = " + table);
        System.out.println("table2 = " + table2);

        Leg[] newLegs = new Leg[4];
//        table.legs = newLegs; // не работает final
//        Table.desk = newDesk; // не работает


    }

}
