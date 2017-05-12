package ch21.ex37.exercise.robot;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ExhaustRobot extends Robot {
    public ExhaustRobot(RobotPool robotPool) {
        super(robotPool);
    }

    @Override
    protected void performService() {
        System.out.println(this + "    : installing Exhaust System");
        assembler.car().addExhaust();
    }
}
