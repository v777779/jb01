package ch21.ex24.exercise.office;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Item {
    private static int counter;
    private final int id =  counter++;

    @Override
    public String toString() {
        return "Item " +id;
    }
}
