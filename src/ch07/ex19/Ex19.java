package ch07.ex19;

import ch07.ex19.local.Air;
import ch07.ex19.local.Cloud;
import ch07.ex19.local.Wind;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Ex19 {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Flower astra = new Flower("Astra");
        Flower rose = new Flower("Rose",1,2);
        Flower pion = new Flower(5);
        System.out.println("\nLeaf Color Check\n");
        astra.getLeaf();
        astra.getLeaf();
        astra.getLeaf();

        System.out.println("\nLeaf Final Parameters Check\n");

        rose.getLeaf(5);
        rose.getLeaf(new Leaf("silver"));
        rose.getLeaf(new Leaf("gold"));

        System.out.println("\nLeaf Final Methods Check\n");

        rose.getGrow();
        astra.getGrow();

        System.out.println("\nLeaf Private Methods Check\n");

        rose.getOpen();       // access to local method
        rose.getToGetOpen(); // access to getter to private method

        System.out.println("\nWind Private Final Methods Check\n");
        Air air = new Air();
        air.f();
        air.g();
        Cloud airCloud = new Air();  // восходящее
//        airCloud.f();  // не работает
//        airCloud.g();  // не работает
        Wind airWind = new Wind();
//        airWind.f();  // не работает
//        airWind.g();  // не работает






    }

}
