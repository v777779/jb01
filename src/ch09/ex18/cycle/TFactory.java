package ch.ex18.cycle;

/**
 * Created by V1 on 14-Feb-17.
 */
public class TFactory implements IFactoryCycle{
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
