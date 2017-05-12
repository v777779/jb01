package ch21.ex37.exercise.robot;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Car {
    private final int id;
    private boolean engine = false;
    private boolean driveTran = false;
    private boolean wheels = false;
    private boolean exhaust = false;
    private boolean body = false;
    private boolean fenders = false;

    public Car(int id) {
        this.id = id;
    }

    public Car() {
        id = -1;
    }

    public synchronized int getId() {
        return id;
    }

    public void addEngine() {
        this.engine = true;
    }

    public void addDriveTran() {
        this.driveTran = true;
    }

    public void addWheels() {
        this.wheels = true;
    }

    public void addExhaust() {
        this.exhaust = true;
    }

    public void addBody() {
        this.body = true;
    }

    public void addFenders() {
        this.fenders = true;
    }

    @Override
    public String toString() {
        return "Building " + id + "["+
                " engine : " + engine +
                " driveTrain:" + driveTran +
                " wheels:" + wheels +
                " exhaust:" + exhaust +
                " body:" + body +
                " fenders:" + fenders + "]";
    }
}
