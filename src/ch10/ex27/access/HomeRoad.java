package ch10.ex27.access;

/**
 * Created by V1 on 17-Feb-17.
 */
public class HomeRoad extends Fitness.RunnerRoad {
    private String type;
    private int noise;

    public HomeRoad(String fitness, String runner, int weight, String homeRoad, int noise) {
        new Fitness(fitness).super(runner, weight);
        this.type =  homeRoad;
        this.noise = noise;
        System.out.println("HomeRoad.Constructor");
    }

    void show() {
        super.show();
        System.out.println("HomeRoad.show > type."+type+" noise."+noise);
    }

 }
