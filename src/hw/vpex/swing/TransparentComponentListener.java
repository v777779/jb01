package hw.vpex.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/**
 * Vadim Voronov
 * Created: 16-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TransparentComponentListener implements ComponentListener {
    public void componentResized(ComponentEvent e) {
        Component[] components = ((JFrame) e.getComponent())
                .getContentPane().getComponents();
        components[0].repaint();
    }

    public void componentMoved(ComponentEvent e) {
        componentResized(e);
    }

    public void componentShown(ComponentEvent e) {
        componentResized(e);
    }

    public void componentHidden(ComponentEvent e) {
        componentResized(e);
    }
}
