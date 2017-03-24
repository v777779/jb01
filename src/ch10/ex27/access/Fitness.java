package ch.ex27.access;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Fitness {
    String name;

    class RunnerRoad {
        private String type;
        private int weight;

        public RunnerRoad(String type, int weight) {
            System.out.println("RunnerRoad.Constructor");
            this.type = type;
            this.weight = weight;
        }

        void show() {
            Fitness.this.show();
            System.out.println("RunnerRoad.show > type." + type+" weight."+weight);
        }
    }

    public Fitness(String name) {
        System.out.println("Fitness.Constructor");
        this.name = name;
    }

    void show() {
        System.out.println("Fitness.show > name."+name);
    }

}
