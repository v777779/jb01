package ch21.ex37.codeb.robot;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CarBuilder {
    public static void check() {
        CarQueue chassisQueue = new CarQueue();
        CarQueue finishingQueue = new CarQueue();
        ExecutorService exec = Executors.newCachedThreadPool();
        RobotPool robotPool = new RobotPool();
        exec.execute(new EngineRobot(robotPool));
        exec.execute(new DriveTrainRobot(robotPool));
        exec.execute(new WheelRobot(robotPool));

        exec.execute(new Assembler(chassisQueue, finishingQueue, robotPool));
        exec.execute(new Reporter(finishingQueue)); // показать собранные тачки

        exec.execute(new ChassisBuilder(chassisQueue)); // запускает конвейер
        try {
            TimeUnit.MILLISECONDS.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        exec.shutdownNow();
    }
}
