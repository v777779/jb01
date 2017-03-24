package ch05.ex21;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Ex21 {


    public static void main(String[] args) {
        Species howHot = Species.MEDIUM;

        System.out.println(howHot.toString()+" order: "+howHot.ordinal()+" value:"+howHot.name());
        for (Species species : Species.values()) {
            System.out.println(species+", order: "+species.ordinal());
        }

        System.out.println(Species.FLAMING.compareTo(howHot));
        System.out.println(Species.MEDIUM.equals(howHot));
        System.out.println(Species.valueOf("HOT_FIX").name());
        System.out.println(Species.valueOf("HOT_FIX").equals(howHot));
        System.out.println(Species.valueOf("HOT_FIX").compareTo(howHot));

        System.out.println("\nTest Burrito\n");

        Burrito plain = new Burrito(Species.NOT);
        Burrito green = new Burrito(Species.MEDIUM);
        Burrito red = new Burrito(Species.HOT_FIX);

        plain.describe();
        green.describe();
        red.describe();

        System.out.println("\nExercise 21 Money Types\n");

        for (MoneyType moneyType : MoneyType.values()) {
            System.out.printf("MoneyType: %d. %s  \t\t",moneyType.ordinal(),moneyType);
            MonyeDesc.describe(moneyType);
        }
    }


}
