package ch.ex2;

/**
 * Created by V1 on 11-Feb-17.
 */
public class Ex2 {
    public static void main(String[] args) {
//        Limpopo limpopo = new Limpopo();              // не работает, если не создавать анонимный класс
        Limpopo limpopo  = new Limpopo()  {             // это экземпляр анонимного класса потомка Limpopo
            String s1 = "String Anonimous Class 1";     // можно ее увидеть только из переопределенных методов
            int i = 15;                                 // можно ее увидеть только из переопределенных методов
            void play() {                               // переопределенный метод
                System.out.print(this.s1+" ");
                System.out.println("Anonimous.play");
            }
        };
        Limpopo limpopo2 = new Limpopo() {
            String s2 = "String Anonimous Class 1";

        };

        limpopo.play();
        limpopo.grow();


    }
}
