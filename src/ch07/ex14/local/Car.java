package ch07.ex14.local;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Car {
    private Engine engine = new Engine();
    private Wheel wheels[] = new Wheel[4]; // links only
    private Door leftDoor = new Door();
    private Door rightDoor = new Door();

    public void leftDoorWinUp() {
        leftDoor.window.rollup();
    }

    public void rightDoorWinUp() {
        rightDoor.window.rollup();
    }
    public void getServiceEngine() {
        engine.service();
    }

    public void inflateWheels(int psi) {
        for (Wheel wheel : wheels) {
            wheel.inflate(psi);
        }
    }

    public Car() {
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel();
        }
    }
}
