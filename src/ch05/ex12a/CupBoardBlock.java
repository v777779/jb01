package ch05.ex12a;

/**
 * Created by V1 on 06-Feb-17.
 */
public class CupBoardBlock {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    static Bowl bowl5 = new Bowl(5);

    public CupBoardBlock() {
        System.out.print("CupBoard() > ");
        bowl4.fBowl(4);
    }

    void fCupboard(int marker) {
        System.out.println("fCupBoard("+marker+")");
    }


    static void getInfo() {
        System.out.println("CupBoard getInfo called");
    }
    {
        System.out.println("----CupBoadBlock non static block----");
    }
    static {
        System.out.println("====CupBoadBlock static block====");

    }
}
