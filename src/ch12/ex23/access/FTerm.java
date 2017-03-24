package ch12.ex23.access;

/**
 * Created by V1 on 03-Mar-17.
 */
public class FTerm {
    private static long counter = 1;
    private final long idCounter =  counter++;

    public FTerm(){
        System.out.println("ft."+idCounter); // создан
    }

    public void dispose() {
        System.out.println("ft."+idCounter+".dispose()");
    }
}
