package lib.animal;

/**
 * Created by V1 on 02-Mar-17.
 */
public class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("Animal not Vegetable");

    public Animal() {
        System.out.println("Animal()");
    }
    protected void dispose() {
        System.out.println("Animal dispose()");
        t.dispose();
        p.dispose();
        super.dispose(); // разрушаем предка
    }
}
