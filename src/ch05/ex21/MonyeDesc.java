package ch05.ex21;

/**
 * Created by V1 on 06-Feb-17.
 */
public class MonyeDesc {
    static void describe(MoneyType moneyType) {
        System.out.print("This is ");
        switch (moneyType) {
            case ONE:
                System.out.println(" one dollar bank note");
                break;
            case TWO:
                System.out.println(" two dollars bank note");
                break;
            case FIVE:
                System.out.println(" five dollars bank note");
                break;
            case TEN:
                System.out.println(" ten dollars bank note");
                break;
            case TWENTY:
                System.out.println(" twenty dollars bank note");
                break;
            case FIFTY:
                System.out.println(" fifty dollars bank note");
                break;
            case HUNDREED:
                System.out.println(" one hundreed dollars bank note");
                break;

        }
    }
}
