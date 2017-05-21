package lib.swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 21-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SliderColor extends JFrame {
    private JSlider jsRed = new JSlider(0, 255, 255);
    private JSlider jsGreen = new JSlider(0, 255, 255);
    private JSlider jsBlue = new JSlider(0, 255, 255);
    private Color color = new Color(255, 255, 255); // исходный цвет

    private JTextField jtRed = new JTextField();
    private JTextField jtGreen = new JTextField();
    private JTextField jtBlue = new JTextField();

    private JPanel jPanel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            jPanel.setBackground(color);
        }
    };

    public SliderColor() throws HeadlessException {
        setLayout(new FlowLayout());
        jPanel.setBackground(color);
        jPanel.setPreferredSize(new Dimension(600, 250));
        
       
        add(new JLabel("Color JPanel with Sliders"));
        add(jPanel);
//        add(jsRed);
        add(getJPanel(jsRed,jtRed,"Red:"));
//        add(jsGreen);
        add(getJPanel(jsGreen,jtGreen,"Red:"));
//        add(jsBlue);
        add(getJPanel(jsBlue,jtBlue,"Red:"));
     }

    private ChangeListener changeListener = new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {         // отрабатывает JSlider
            color = new Color(jsRed.getValue(), jsGreen.getValue(), jsBlue.getValue());
            jtRed.setText(""+jsRed.getValue());
            jtGreen.setText(""+jsGreen.getValue());
            jtBlue.setText(""+jsBlue.getValue());
            repaint();
        }
    };

    private JPanel getJPanel(JSlider js, JTextField jt, String labelText) {
        JPanel jp = new JPanel();
        js.setPreferredSize(new Dimension(550, 20));
        js.addChangeListener(changeListener);

        jt.setText("255");
        jt.setColumns(4);
        jt.setHorizontalAlignment(SwingConstants.CENTER);
        jt.setEditable(false);

        JLabel jLabel = new JLabel(labelText,SwingConstants.CENTER);
        jp.add(jLabel);
        jp.add(js);
        jp.add(jt);
        return jp;
    }
    
    public static void check() {
        SwingConsole.run(new SliderColor(), 700, 450);
    }

    public static void main(String[] args) {
        check();
    }
}
