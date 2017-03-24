package ch05.ex8;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Ex8 {
    public static void main(String[] args) {
        Turbo turbo = new Turbo();                      // получить экземпляр
        Turbo t2=null;                                  // пустая ссылка даже не null

        System.out.println("turbo:"+turbo+" turbo.i:"+turbo.i+" t2:"+t2);
        t2 = turbo.getInstance(5);                      // получить копию экземпляра класса
        System.out.println("turbo:"+turbo+" turbo.i:"+turbo.i+" t2:"+t2+" t2_i:"+t2.i);
        t2.getIcrement().getIcrement().getIcrement();   // инкремент и вернуть ссылку на экземпляр класса

        System.out.println("\nApple Pealing\n");
        Apple apple = new Apple();
        apple.apple = 5;
        System.out.println("apple.apple= "+apple.apple);
        Apple apple1 = Peeler.getPeeled(apple);
        System.out.println("apple.apple= "+apple.apple);
        System.out.println("apple1.apple= "+apple.apple);
        System.out.println("Peeler.apple= "+Peeler.getPeeled(apple).apple);
        System.out.println("apple.apple= "+apple.apple);
        System.out.println("apple1.apple= "+apple1.apple);


        System.out.println("\nExercise 8\n");
        Pine pine = new Pine();
        pine.grow();
    }
}

