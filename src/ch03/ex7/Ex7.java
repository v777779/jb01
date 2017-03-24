package ch03.ex7;

/**
 * Created by V1 on 04-Feb-17.
 */
public class Ex7 {
    public static void main(String[] args) {


        System.out.println("\n Head or Tail \n");
        Coin coin = new Coin();
        int i = 5;
        while (i-- > 0) {
            System.out.println("Coin thrown and ... got: "+coin.getState());
        }

    }
}
