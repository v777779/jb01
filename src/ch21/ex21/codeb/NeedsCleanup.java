package ch21.ex21.codeb;

/**
 * Vadim Voronov
 * Created: 04-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class NeedsCleanup {
    private final int id;

    public NeedsCleanup(int id) {
        this.id = id;
        System.out.println("NeedsCleanup "+id);
    }
    public void cleanup() {
        System.out.println("Cleaning up "+id);
    }


}
