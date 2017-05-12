package ch21.ex38.exercise.robot;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BuildingConstruction {
    public static void check() {
        BuildQueue buildQueue = new BuildQueue();
        BuildQueue finishingQueue = new BuildQueue();
        ExecutorService exec = Executors.newCachedThreadPool();
        RobotPool robotPool = new RobotPool();
        exec.execute(new PlanWorks(robotPool));
        exec.execute(new GroundWork(robotPool));
        exec.execute(new FoundationConstruction(robotPool));
        exec.execute(new WallConstruction(robotPool));
        exec.execute(new RoofConstruction(robotPool));
        exec.execute(new DoorWindowInstall(robotPool));
        exec.execute(new SupplySystemsInstallation(robotPool));
        exec.execute(new FinishingWorks(robotPool));
        exec.execute(new Assembler(buildQueue, finishingQueue, robotPool));
        exec.execute(new Reporter(finishingQueue)); // показать собранные тачки

        exec.execute(new ProjectBuilder(buildQueue)); // запускает конвейер
        try {
            TimeUnit.MILLISECONDS.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        exec.shutdownNow();
    }
}
