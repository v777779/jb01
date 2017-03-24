package ch02.hw7;

/**
 * Created by V1 on 03-Feb-17.
 */
public class Ex7 {
    static void show(){
        System.out.println("main StaticTest.i:"+StaticTest.i);

    }
    public static void main(String[] args) {

        StaticTest.i = 14;
        Ex7.show();
        Incrementable.show();
        Incrementable.increment();
        Ex7.show();
        Incrementable.show();

        StaticTest.i +=5;

        Ex7.show();
        Incrementable.show();


   }
}
