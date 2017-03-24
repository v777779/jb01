package ch02.ex04;

/**
 * Created by V1 on 02-Feb-17.
 */
public class Prim {
    int x;

    void show() {
        int y = 0;
        System.out.println("class.x: " + this.x + " local y: " + y); // не пропускает int y;
    }

}
