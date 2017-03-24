package ch07.ex11;

/**
 * Created by V1 on 08-Feb-17.
 */
public class SpaceShip {
    private String shipName;
    private ControlCenter control = new ControlCenter();


    public SpaceShip(String shipName) {
        this.shipName = shipName;
    }

    @Override
    public String toString() {
        return shipName;
    }

    void moveUp(int velocity) {         // делегированны метод
        control.moveUp(velocity);
    }

    void moveDown(int velocity) {         // делегированны метод
        control.moveDown(velocity);
    }

    void moveRight(int velocity) {         // делегированны метод
        control.moveRight(velocity);
    }

    void moveLeft(int velocity) {         // делегированны метод
        control.moveLeft(velocity);
    }

    void moveForward(int velocity) {         // делегированны метод
        control.moveForward(velocity);
    }

    void moveBack(int velocity) {         // делегированны метод
        control.moveBack(velocity);
    }

    void turboBoost(int velocity) {         // делегированны метод
        control.turboBoost(velocity);
    }

}
