package ch09.ex04;

/**
 * Created by V1 on 11-Feb-17.
 */
public class Ex4 {
    public static void main(String[] args) {
        Stone stone = new Tool();
        Stone stone2 = new Sharp();

        Stone.getBase((stone));  // вызывается static метод
        stone.getBase2(stone); // вызывается static метод

        Stone.getBase((stone2)); // вызывается static метод
        stone2.getBase2(stone2); // вызывается static метод
        System.out.println((-1>>31) +" "+(-1>>>31));
    }
}
