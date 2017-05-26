package ch22.ex37.exercise;

import javax.swing.*;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 26-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Valve extends JPanel {
    boolean state = false;
    int level = 0;

    public Valve() {
        state = true;
        level = 50;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(250,100);
    }
}
