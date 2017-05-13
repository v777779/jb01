package ch21.ex37.codeb.robot;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Assembler implements Runnable  {
    private CarQueue chassisQueue;
    private CarQueue finishingQueue;

    private Car car;
    private CyclicBarrier barrier = new CyclicBarrier(2); // 4 задачи до барьера
    private RobotPool robotPool;  // барьер срабатывает когда все отстрелялись

    public Assembler(CarQueue chassisQueue, CarQueue finishingQueue, RobotPool robotPool) {
        this.chassisQueue = chassisQueue;
        this.finishingQueue = finishingQueue;
        this.robotPool = robotPool;
    }

    public Car car() {
        return car;
    }
    public CyclicBarrier barrier() {
        return barrier;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                car = chassisQueue.take(); // получить раму
                barrier = new CyclicBarrier(2);   // барьер на однудве задачи
                robotPool.hire(EngineRobot.class, this);
                barrier.await();                        // барьер на одну задачу
                barrier = new CyclicBarrier(3);   // барьер на две задачи
                robotPool.hire(DriveTrainRobot.class, this);
                robotPool.hire(WheelRobot.class, this);
                barrier.await();                        // ждем пока все закончат свою работу
                finishingQueue.put(car);
            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Assembler off");
    }
}
