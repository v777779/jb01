package ch18.ex30.exercise.shapes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class LineS extends Shapes {
    private static int color = RED;

    public LineS(int xPos, int yPos, int dimension) {
        super(xPos, yPos, dimension);
    }

    @Override
    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }

    public static void serializeStaticState(ObjectOutputStream stream) throws IOException{
        stream.writeInt(color);
    }
    public static void deserializeStaticState(ObjectInputStream stream) throws IOException{
        color = stream.readInt();
    }


}
