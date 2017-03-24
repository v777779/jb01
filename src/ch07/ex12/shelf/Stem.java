package ch07.ex12.shelf;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Stem extends Root {
    public Stem(int[] ints) {
        super(ints);            // создание предка в первой строке

        System.out.println("Stem.Constructor ints[]"); // в конце операции по созданию потомка
    }
    public void dispose() {
        System.out.println("Stem.dispose ints[]"); // сначала операции по завершению потомка

        super.dispose(); // завершение предка
    }
}
