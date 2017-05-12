package ch21.ex38.exercise.robot;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Assembler implements Runnable  {
    private BuildQueue buildQueue;
    private BuildQueue finishingQueue;

    private Building building;
    private CyclicBarrier barrier = new CyclicBarrier(2); // 4 задачи до барьера
    private RobotPool robotPool;  // барьер срабатывает когда все отстрелялись

    public Assembler(BuildQueue buildQueue, BuildQueue finishingQueue, RobotPool robotPool) {
        this.buildQueue = buildQueue;
        this.finishingQueue = finishingQueue;
        this.robotPool = robotPool;
    }

    public Building building() {
        return building;
    }
    public CyclicBarrier barrier() {
        return barrier;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                building = buildQueue.take();   // получить здание
                robotPool.hire(PlanWorks.class, this);
                barrier.await();                    // ждем пока закончит
                robotPool.hire(GroundWork.class, this);
                barrier.await();                    // ждем пока закончит
                robotPool.hire(FoundationConstruction.class, this);
                barrier.await();                    // ждем пока закончит
                robotPool.hire(RoofConstruction.class, this);
                barrier.await();                    // ждем пока закончит
                robotPool.hire(WallConstruction.class, this);
                barrier.await();                    // ждем пока закончит
                robotPool.hire(DoorWindowInstall.class, this);
                barrier.await();                    // ждем пока закончит
                robotPool.hire(SupplySystemsInstallation.class, this);
                barrier.await();                    // ждем пока закончит
                robotPool.hire(FinishingWorks.class, this);
                barrier.await();                    // ждем пока закончит
                finishingQueue.put(building);
            }
        } catch (InterruptedException e) {
            System.out.println("Assembler interrupted");
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Assembler off");
    }
}
