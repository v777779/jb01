package ch21.ex37.codec.robot;

import java.util.concurrent.CountDownLatch;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Assembler implements Runnable  {
    private CarQueue chassisQueue;
    private CarQueue finishingQueue;

    private Car car;
    private CountDownLatch latch = new CountDownLatch(1); // 1 задача до барьера
    private RobotPool robotPool;  // барьер срабатывает когда все отстрелялись

    public Assembler(CarQueue chassisQueue, CarQueue finishingQueue, RobotPool robotPool) {
        this.chassisQueue = chassisQueue;
        this.finishingQueue = finishingQueue;
        this.robotPool = robotPool;
    }

    public Car car() {
        return car;
    }
    public CountDownLatch barrier() {
        return latch;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                car = chassisQueue.take(); // получить раму
                latch = new CountDownLatch(1);   // барьер на однудве задачи
                robotPool.hire(EngineRobot.class, this);
                latch.await();                        // барьер на одну задачу
                latch = new CountDownLatch(2);   // барьер на две задачи
                robotPool.hire(DriveTrainRobot.class, this);
                robotPool.hire(WheelRobot.class, this);
                latch.await();                        // ждем пока все закончат свою работу
                finishingQueue.put(car);
            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println("Assembler off");
    }
}
