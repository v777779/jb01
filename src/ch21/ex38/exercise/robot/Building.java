package ch21.ex38.exercise.robot;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Building {
    private final int id;
    private boolean plan = false;
    private boolean groundWorks = false;
    private boolean foundation = false;
    private boolean walls = false;
    private boolean roof = false;
    private boolean doors = false;
    private boolean supply = false;
    private boolean finishing = false;
  
    public Building(int id) {
        this.id = id;
    }

    public Building() {
        id = -1;
    }

    public synchronized int getId() {
        return id;
    }

    public void addPlan() {
        this.plan = true;
    }

    public void addGroundWorks() {
        this.groundWorks = true;
    }

    public void addFoundation() {
        this.foundation = true;
    }

    public void addWalls() {
        this.walls = true;
    }

    public void addRoof() {
        this.roof = true;
    }

    public void addDoors() {
        this.doors = true;
    }

    public void addSupply() {
        this.supply = true;
    }

    public void addFinishing() {
        this.finishing = true;
    }

    
    @Override
    public String toString() {
        return "Building " + id + "["+
                " plan:" + plan +
                " groundWorks:" + groundWorks +
                " foundation:" + foundation +
                " walls:" + walls +
                " roof:" + roof +
                " doors windows:" + doors +
                " supply systems:" + supply +
                " finishing:" + finishing + "]";
    }
}
