package ch08.ex17.office;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Stage {
    private Actor actor = new HappyActor();  // изначально тип объекта HappyActor
    public void change() {
        actor = new SadActor();             // меняем по ходу программы тип на SadActor
    }                                       // да используется наследование внутреннего класса
    public void performPlay() {
        actor.act();
    }

}
