package ch22.ex36.exercise.jbean;

import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Vadim Voronov
 * Created: 25-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Frog {
    private int jumps;
    private Color color;
    private Spot spots;
    private boolean jumper;

    public int getJumps() {
        return jumps;
    }

    public void setJumps(int jumps) {
        this.jumps = jumps;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Spot getSpots() {
        return spots;
    }

    public void setSpots(Spot spots) {
        this.spots = spots;
    }

    public boolean isJumper() {
        return jumper;
    }

    public void setJumper(boolean jumper) {
        this.jumper = jumper;
    }

    public void addActionListener(ActionListener al) {
    }

    public void removeActionListener(ActionListener al) {
    }

    public void addKeyListener(ActionListener kl) {
    }

    public void removeKeyListener(ActionListener kl) {
    }

// ordinary methods
    public void croak() {
        System.out.println("Ribbet!");
    }

}
