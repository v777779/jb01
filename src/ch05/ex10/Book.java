package ch05.ex10;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Book {
    boolean checkedOut = false;         // при создании  false  Book()


    public Book(boolean checkedOut) {   // Book(true) программист устанавливает флаг занятости true
        this.checkedOut = checkedOut;
        System.out.println("Book created > "+this);
    }

    void checkIn() {                    // ручная очистка объекта
        checkedOut = false;             // программист сбросил поле вручную false
        System.out.println("Book CheckIn done > "+this);
    }

    @Override
    protected void finalize() throws Throwable {        // переопределение finalize()
        System.out.println("GC вызвал finalize() > Book "+this);     // демо просто проверяем был ли вызов finalize()
        if (checkedOut) {                               // проверяем была ли ручная очистка объекта
            System.out.println("Ошибка: checkedOut   > Book "+this);
        }
        super.finalize();  // уходим на стандартный finalize()
    }

    public Book() {
    }
}
