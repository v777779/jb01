package hw.vpex.swing;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

/**
 * Vadim Voronov
 * Created: 16-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ListListenerImpl extends MouseAdapter{
        private Vector elements;
        private JList List;

        ListListenerImpl(JList List, Vector elements) {
            this.List = List;
            this.elements = elements;
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            int pos = List.locationToIndex(e.getPoint());
        }

}
