package ch05.ex12a;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Ex12a {
    static Table table = new Table();                 // статические объекты создаются здесь
//    static CupBoard cupBoard = new CupBoard();      // статический экземпляр

    public static void main(String[] args) {
        System.out.println("\n----Main Test Static-----");

        Bowl.getInfo();
        Table.getInfo();
        CupBoardBlock.getInfo(); // первое обращение здесь статические объекты

        System.out.println("\nnew CupBoard Created");
        CupBoard cupBoard = new CupBoard();           // здесь обычные объекты
        System.out.println("\nnew CuBoard Created");
        new CupBoard();
        table.fTable(1);        // прямой вызов
        cupBoard.fCupboard(1);  // прямой вызов

        System.out.println("\nExercise  12A\n");
//        System.out.println("Case 1 > Init static via Class call");
//        Cups.i = 1;

//        System.out.println("Case 2 > Init static via Constructor call");
//        Cups cups = new Cups();   // инициализация происходит здесь
//        Cups cups2 = new Cups();  // здесь инициализации повторно нет

//          System.out.println("Case 3 > Init static no");

//          System.out.println("Case 4 > Init static via Constructor once");
//          Cups cups = new Cups();   // инициализация происходит здесь
//          Cups cups2 = new Cups();  // инициализация происходит здесь

        Cups cups = new Cups();
        Cups cups2 = new Cups();  // потеря объекта и данных
        Cups.cup1.i = 10;
        Cups.cup4.i = 15;
        Cups.show();
        Cups cups3 = new Cups();  // Cups.cup2 новые данные
        Cups.show();
        System.gc();

    }
}
