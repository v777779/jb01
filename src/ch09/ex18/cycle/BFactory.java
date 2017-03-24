package ch.ex18.cycle;

/**
 * Created by V1 on 14-Feb-17.
 */
public class BFactory implements IFactoryCycle{
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
