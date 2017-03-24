package ch06.ex08.access;

/**
 * Created by V1 on 07-Feb-17.
 */
class Disk {
private static int i=0;
private static String s;
private static Disk disk = new Disk("static Disk done");

    private Disk(String s) {  // закрытый конструктор
        Disk.s = "Disk Default Constructor > "+s;
    }

    static Disk access() {
        return disk;                // доступ к Singletone

    }

    void show() {
        System.out.println(Disk.s+" accessed "+i++ +" times");  // вывести данные статической переменной
    }

}
