package ch21.ex38.exercise.robot;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class PlanWorks extends Robot {

    public PlanWorks(RobotPool robotPool) {
        super(robotPool);
    }

    @Override
    protected void performService() {
        System.out.println(this + " : plan approval");
        assembler.building().addPlan();
    }

}
