package lib.animal;

/**
 * Created by V1 on 02-Mar-17.
 */
public class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("Both water and land");

    public Amphibian() {
        System.out.println("Amphibian()");
    }
    protected void dispose() {
        System.out.println("Amphibian dispose()");
        t.dispose();
        p.dispose();
        super.dispose(); // разрушаем предка
    }
}
