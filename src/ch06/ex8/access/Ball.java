package ch06.ex8.access;

/**
 * Created by V1 on 07-Feb-17.
 */
class Ball {  // закрытый класс
    String s = "";
    int i = 0;

    private Ball(String s) {  // закрытый конструктор
        this.s = "Ball Default Constructor > "+s;
    }

    static Ball mkeBall(String s) {
        return new Ball(" makeBall: "+s+" "); // конструктор клиента

    }


}
