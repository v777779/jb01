package ch05.ex10;

import ch05.ex08.Turbo;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Ex10 {
    public static void main(String[] args) {
        Book book = new Book(true); // создали объект флаг установлен
        System.out.println("\nCheck Ready Condition \n");
        System.out.println(book.checkedOut);
        book.checkIn();                      // флаг сбросили "очистили" объект
        new Book(true);             // создали новый объект флаг установлен
        new Book(true).checkIn();   // создали новый объект и тут же флаг сбросили
        System.gc();

        System.out.println("\nCheck Turbo Package\n");
        Turbo turbo = new Turbo();

        System.out.println("\nMethod Finalize\n");
        Level level = new Level();
        System.out.println("GC called");
        System.gc();

    }
}
