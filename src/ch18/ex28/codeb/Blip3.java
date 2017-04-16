package ch18.ex28.codeb;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class Blip3 implements Externalizable {
    private int i;
    private String s;

    public Blip3() {  // обязательно присутствие
        System.out.println("Blip3.Constructor");
    }

    public Blip3(int i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {   // порядок записи и чтения одинаковый
        System.out.println("Blip3.writeExternal");
        out.writeObject(s);
        out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip3.readExternal"); // порядок записи и чтения одинаковый
        s = (String) in.readObject();
        i = in.readInt();
    }

    @Override
    public String toString() {
        return  "["+s+" "+i+"]" ;
    }
}
