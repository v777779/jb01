package lib.animal;

/**
 * Created by V1 on 02-Mar-17.
 */
public class LivingCreature {
    private Characteristic p = new Characteristic("is alive");
    private Description t = new Description("Basic Living Creature");

    public LivingCreature() {
        System.out.println("LivingCreature()");
    }
    protected void dispose() {
        System.out.println("Living Creature dispose()");
        t.dispose();
        p.dispose();
    }
}
