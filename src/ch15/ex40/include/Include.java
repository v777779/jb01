package ch15.ex40.include;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nBound w Generic Latent w Reflections Check\n");
        CommR.perform(new Mime());
        CommR.perform(new SmartDog());
        CommR.perform(new Robot());


    }
}
