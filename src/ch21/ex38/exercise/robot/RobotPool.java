package ch21.ex38.exercise.robot;

import java.util.HashSet;
import java.util.Set;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class RobotPool {
    private Set<Robot> pool = new HashSet<>();

    public RobotPool() {
    }

    public synchronized void add(Robot robot) {
        pool.add(robot);
        notifyAll();
    }

    public synchronized void hire(Class<? extends Robot> robotType,
                                  Assembler assembler) throws InterruptedException {
        for (Robot robot : pool) {
            if (robot.getClass().equals(robotType)) {
                pool.remove(robot);
                robot.assignAssembler(assembler);
                robot.engage();
                return;
            }
        }
        System.out.println("hire not found robot wait() <***>");
        wait();
//        System.out.println("hire started with pool:"+pool+" a:"+assembler+" r:"+robotType+  "<***>");
        hire(robotType,assembler);
    }
    public synchronized void release(Robot robot) {
        add(robot);
    }

}
