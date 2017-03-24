package ch07.ex19;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Plant {

    final void getGrow() {
        System.out.println("Plant.getGrow."+this);
    }
    private void getOpen() {
        System.out.println("Plant.getOpen."+this);
    }

    void getToGetOpen() {
        getOpen();
    }
}
