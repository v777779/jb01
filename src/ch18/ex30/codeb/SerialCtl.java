package ch18.ex30.codeb;

import java.io.*;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class SerialCtl implements Serializable {
    private String a;
    private transient String b;

    public SerialCtl() {
    }

    public SerialCtl(String a, String b) {
        this.a = "Non transient:"+a;
        this.b = "Transient    :"+b;
    }


    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(b);

    }


    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
         b =(String)stream.readObject();
    }


    @Override
    public String toString() {
        return a + "\n" + b;
    }

}
