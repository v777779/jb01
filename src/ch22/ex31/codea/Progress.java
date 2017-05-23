package ch22.ex31.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 23-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Progress extends JFrame {
    private JProgressBar jProgressBar = new JProgressBar();
    private ProgressMonitor progressMonitor = new ProgressMonitor(
            this,"Monitoring Progress","Test",0,100 );
    private JSlider jSlider = new JSlider(JSlider.HORIZONTAL,0,100,60);

    public Progress() throws HeadlessException {
        setLayout(new GridLayout(2,1));
        add(jProgressBar);
        progressMonitor.setProgress(0);
        progressMonitor.setMillisToPopup(1000); // 1 sec
        jSlider.setValue(0);
        jSlider.setPaintTicks(true);
        jSlider.setMajorTickSpacing(20);
        jSlider.setMinorTickSpacing(5);
        jSlider.setBorder(new TitledBorder("Slide Me"));
        jProgressBar.setModel(jSlider.getModel()); // задать модель общую для JProgrssBar и JSlider
        add(jSlider);
        jSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                progressMonitor.setProgress(jSlider.getValue()); // ProgressMonitor по JSlider
            }
        });
    }

    public static void check() {
        SwingConsole.run(new Progress(), 300, 200);
    }

}
