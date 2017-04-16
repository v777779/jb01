package ch18.ex27.codec;

import java.io.Serializable;
import java.util.Random;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class WormS implements Serializable {
    private static Random rnd = new Random();
    private DataS[] datas = {
            new DataS(rnd.nextInt(10)),
            new DataS(rnd.nextInt(10)),
            new DataS(rnd.nextInt(10))
    };

    private WormS next; // link to next in linked list
    private char ch;

    public WormS() {
        System.out.println("WormS default constructor");
    }

    public WormS(int i, char ch) {  // строит червяка просто сам за сам
        System.out.println("WormS constructor:"+i);
        this.ch = ch;
        if (--i > 0) {  // пока число звеньев больше 0
            next = new WormS(i,(char)(ch+1));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(":");
        sb.append(ch);
        sb.append("(");
        for (DataS data : datas) {
            sb.append(data);
        }
        sb.append(")");
        if (next != null) {
            sb.append(next); // прогнать всю цепочку Worms
        }

        return sb.toString();
    }
}
