package ch02.hw1;

/**
 * Created by V1 on 03-Feb-17.
 */
public class Ex1 {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.i);
        System.out.println("."+book.c+"."+" c.toHexString: "+Integer.toHexString(book.c)+
                                          " c.valueOf: "+Integer.valueOf(book.c));

    }

}
