package ch.ex25.thrown;

import java.awt.*;

/**
 * Created by V1 on 18.03.2017.
 */
public class Bounded extends Dimension implements IColor, IWeight{
    @Override
    public int getWeight() {
        System.out.println("Bounded.getWeight");
        return 0;
    }

    @Override
    public Color getColor() {
        System.out.println("Bounded.getColor");
        return null;
    }
}
