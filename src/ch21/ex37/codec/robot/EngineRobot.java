package ch21.ex37.codec.robot;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class EngineRobot extends Robot {

    public EngineRobot(RobotPool robotPool) {
        super(robotPool);
    }

    @Override
    protected void performService() {
        System.out.println(this);// + " installing engine");
        assembler.car().addEngine();
    }

}
