package ch.ex25.remote;

import java.awt.*;

/**
 * Created by V1 on 18.03.2017.
 */
public class Bounded extends Dimension implements IColor,IWeight{
    @Override
    public Color getColor() {
        System.out.println("Bounded.getColor");
        return null;
    }

    @Override
    public int getWeight() {
        System.out.println("Bounded.getWeight");
        return 0;
    }
}
