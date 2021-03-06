package ch21.ex38.exercise.robot;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class WallConstruction extends Robot {
    public WallConstruction(RobotPool robotPool) {
        super(robotPool);
    }

    @Override
    protected void performService() {
        System.out.println(this + " : walls construction");
        assembler.building().addWalls();
    }
}
