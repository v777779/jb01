package ch21.ex37.exercise.robot;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class FenderRobot extends Robot {
    public FenderRobot(RobotPool robotPool) {
        super(robotPool);
    }

    @Override
    protected void performService() {
        System.out.println(this + "     : installing Fenders");
        assembler.car().addFenders();
    }
}
