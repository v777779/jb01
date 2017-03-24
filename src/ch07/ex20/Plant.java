package ch07.ex20;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Plant {

    final void getGrow() {  // фиксирован но доступен
        System.out.println("Plant.getGrow."+this);
    }
    private void getOpen() { // фиксирован но недоступен
        System.out.println("Plant.getOpen."+this);
    }

    void getToGetOpen() {
        System.out.print("Plant.getToGetOpen.");
        getOpen();
    }
}
