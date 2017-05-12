package ch21.ex38.exercise.robot;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class FoundationConstruction extends Robot {
    public FoundationConstruction(RobotPool robotPool) {
        super(robotPool);
    }

    @Override
    protected void performService() {
        System.out.println(this + " : foundation construction");
        assembler.building().addFoundation();
    }
}
