package ch07.ex16;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Ex16 {
    public static void main(String[] args) {
        Instrument instrWind = new Wind();
        Instrument instrTube = new Tube();
        Instrument instrument = new Instrument();
        instrWind.play();

        Wind wind2 = (Wind) instrWind ; // так работает, когда внутри точно такой же тип
        Wind wind4 = (Wind) instrument; // так не работает в Runtime


        System.out.println("\nExercise 16 Composition and Inheritance Check\n");

        Amphibian frog = new Frog();
        frog.jump();
        frog.sweem();
        frog.step();

    }
}
