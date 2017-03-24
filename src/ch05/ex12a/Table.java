package ch05.ex12a;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Table {
    static Bowl bowl1 = new Bowl(1); //
    static Bowl bowl2 = new Bowl(2); //

    public Table() {            // конструктор выводит только Table
        System.out.print("Table() > ");
        bowl2.fBowl(2);
    }

    void fTable(int marker) {
        System.out.println("fTable(" + marker + ")");
    }

    static void getInfo() {
        System.out.println("Table getInfo called");
    }

}
