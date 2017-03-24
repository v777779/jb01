package ch15.ex08.access.actors;


import lib.utils.IFactory;
import lib.utils.IGenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by V1 on 10-Mar-17.
 */
public class StoryChGen implements IGenerator<StoryCh>, Iterable<StoryCh> {
    private static List<IFactory<? extends StoryCh>> pList = new ArrayList<>();
    private static Random rnd = new Random();
    private int size = 0;

    static {
        pList.add(new Scrooge.Factory());
        pList.add(new Jafar.Factory());
        pList.add(new Cruella.Factory());
        pList.add(new Scar.Factory());
        pList.add(new Bamby.Factory());
        pList.add(new Alladdin.Factory());
        pList.add(new MikiMouse.Factory());
        pList.add(new GummyBear.Factory());
    }

    public StoryChGen() {
    }

    public StoryChGen(int size) {
        this.size = size;
    }

    public static StoryCh randomCoffee() {  // тип возвращаем случайно бесконечно
        return pList.get(rnd.nextInt(pList.size())).create(); // создать экземпляр случайно
    }

    public StoryCh next() {  // тип возвращаем случайно бесконечно
            return pList.get(rnd.nextInt(pList.size())).create(); // создать экземпляр случайно
    }

    @Override
    public Iterator<StoryCh> iterator() {
        return new Iterator<StoryCh>() {
            int count = size;
            @Override
            public boolean hasNext() {
                return (count > 0);
            }

            @Override
            public StoryCh next() {
                count--;
                return StoryChGen.this.next();
            }
        };
    }

}
