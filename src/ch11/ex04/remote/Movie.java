package ch11.ex04.remote;

import java.util.*;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Movie extends Movies implements IMovie{
    ArrayList<String> alist = new ArrayList<>();
    LinkedList<String> llist = new LinkedList<>();
    HashSet<String> hset = new HashSet<>();
    LinkedHashSet<String> lhset = new LinkedHashSet<>();
    public int repeat = 10;
    private int index = 0;
    private boolean flag = false;
    private Iterator<String> workIt;


    @Override
    public void gen(Collection c) {
        c.clear();
        if (!flag) {
            c.addAll(Arrays.asList(S_NAMES));
        } else {
            c.addAll(Arrays.asList(S_NAMES2));
        }
        flag = !flag;
    }

    @Override
    public void setup(Collection c) {
        index = 0;
        workIt = c.iterator();

    }

    @Override
    public String next(Collection c) {
        if (!workIt.hasNext()) {
            workIt = c.iterator();  // опять с начала
        }
       return (workIt.next().toString());
    }

    @Override
    public void show(Collection c) {
        setup(c);
        System.out.print("Collection > ");
        for (int i = 0; i < repeat; i++) {
            System.out.print (next(c)+" ");
        }
        System.out.println();
    }

    public void show(Collection c, int repeat) {
        this.repeat = repeat;
        show(c);
    }

}
