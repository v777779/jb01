package lib.animal;

/**
 * Created by V1 on 02-Mar-17.
 */
public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");

    public Frog() {
        System.out.println("Frog()");
    }
    public void dispose() {
        System.out.println("Frog dispose()");
        t.dispose();
        p.dispose();
        super.dispose(); // разрушаем предка
    }
}
