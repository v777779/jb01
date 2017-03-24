package ch15.ex39.access.mixing;

import java.awt.*;
import java.util.Random;

/**
 * Created by V1 on 22.03.2017.
 */
public class ColorR implements IColor {
    Color[] colors = new Color[]{ Color.CYAN,Color.BLACK,Color.BLUE,Color.DARK_GRAY,
    Color.GREEN,Color.LIGHT_GRAY,Color.MAGENTA,Color.ORANGE,Color.PINK,
    Color.RED,Color.WHITE, Color.YELLOW};
    @Override
    public Color getColor() {

        return colors[new Random().nextInt(colors.length)];
    }
}
