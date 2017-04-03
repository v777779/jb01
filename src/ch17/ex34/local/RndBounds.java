package ch17.ex34.local;

/**
 * Created by V1 on 02-Apr-17.
 */
public class RndBounds {
    private int count = 0;

    public void usage() {
        System.out.println("Usage:");
        System.out.println("RandomBounds lower");
        System.out.println("RandomBounds upper");
        System.exit(1);
    }

    public void lower() {
        System.out.println("Randwom lower started...");
        while(Math.random() != 0.0) {
            if (count++ > 10000) {
                System.out.println("interrupted...");
                break;
            }
        };
    }

    public void upper() {
        System.out.println("Randwom upper started...");
        while(Math.random() != 1.0) {
            if (count++ > 10000) {
                System.out.println("interrupted...");
                break;
            }


        };
        usage();
    }

}
