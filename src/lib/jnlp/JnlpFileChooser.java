package lib.jnlp;

import javax.jnlp.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Vadim Voronov
 * Created: 24-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class JnlpFileChooser extends JFrame {
    private JTextField jtFileName = new JTextField();
    private JButton jbOpen = new JButton("Open");
    private JButton jbSave = new JButton("Save");
    private JEditorPane jEditorPane = new JEditorPane();
    private JScrollPane jScrollPane = new JScrollPane();
    private FileContents fileContents;

    class OpenL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            FileOpenService fileOpenService = null;
            try {
                fileOpenService = (FileOpenService) ServiceManager.lookup(
                        "javax.jnlp.FileOpenService");
            } catch (UnavailableServiceException ex) {
                throw new RuntimeException(ex);
            }
            if (fileOpenService != null) {
                try {
                    fileContents = fileOpenService.openFileDialog(
                            ".", new String[]{"txt", "*"});
                    if (fileContents == null) {
                        return;
                    }
                    jtFileName.setText(fileContents.getName());
                    jEditorPane.read(fileContents.getInputStream(),null);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                jbSave.setEnabled(true); // activate button
            }
        }
    }

    class SaveL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            FileSaveService fileSaveService = null;
            try {
                fileSaveService = (FileSaveService) ServiceManager.lookup(
                        "javax.jnlp.FileSaveService");
            } catch (UnavailableServiceException ex) {
                throw new RuntimeException(ex);
            }
            if (fileSaveService != null) {
                try {
                    fileContents = fileSaveService.saveFileDialog(
                            ".", new String[]{"txt"},
                            new ByteArrayInputStream(jEditorPane.getText().getBytes()),
                            fileContents.getName());
                    if (fileContents == null) {
                        return;
                    }
                    jtFileName.setText(fileContents.getName());

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                jbSave.setEnabled(true); // activate button
            }
        }

    }

    public JnlpFileChooser() throws HeadlessException {
        JPanel jPanel = new JPanel();
        jbOpen.addActionListener(new OpenL());

        jbSave.addActionListener(new SaveL());
        jbSave.setEnabled(false);

        jPanel.add(jbOpen);
        jPanel.add(jbSave);
        jEditorPane.setContentType("text"); // panel content
        jScrollPane.getViewport().add(jEditorPane);
        add(jScrollPane,BorderLayout.CENTER);
        add(jPanel,BorderLayout.SOUTH);

        jtFileName.setEditable(false);
        jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2,1));
        jPanel.add(jtFileName);
        add(jPanel,BorderLayout.NORTH);
    }

    public static void check() {
        JnlpFileChooser jnlpFileChooser = new JnlpFileChooser();
        jnlpFileChooser.setSize(400,300);
        jnlpFileChooser.setVisible(true);
//        SwingConsole.run(new lib.jnlp.JnlpFileChooser(), 400, 300);
    }

}
