package ch18.ex28.codeb;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class Blip2 implements Externalizable {
    public Blip2() {
        System.out.println("Blip2.Constructor");
    }  // non public constructor

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip2.writeExternal");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip2.readExternal");
    }
}
