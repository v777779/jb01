package ch.ex25.local;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Caller {  // внутри содержит объект класса по интерфейсу
    private Incrementable callBack; // экземпляр ссылки на класс

    public Caller(Incrementable callBack) { // конструктор получает ссылку на внешний объект по интерфейсу
        this.callBack = callBack;
    }

    public void play() {  // стандартный вызов
        callBack.increment();
        System.out.println();

    }

    static void play(Incrementable inc) {
        inc.increment();
    }
}
