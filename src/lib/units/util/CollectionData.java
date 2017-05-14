package lib.units.util;

import lib.utils.IGenerator;

import java.util.ArrayList;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(IGenerator<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(IGenerator<T> gen, int quantity) {
        return new CollectionData<T>(gen, quantity);
    }
}
