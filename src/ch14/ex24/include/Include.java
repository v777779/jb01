package ch14.ex24.include;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nDynamic Proxy and INull Object Check\n");

        Robot[] bots = new Robot[] {
                new SnowRobot("SnowBee"),
                NullRobot.getNULL(SnowRobot.class) // создает объект NullRobot
        };

        for (Robot bot : bots) {
            Robot.Test.test(bot);  // прогнать встроенным статическим классом
            System.out.println();
        }

    }
}
