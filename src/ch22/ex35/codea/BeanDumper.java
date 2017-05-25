package ch22.ex35.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.*;
import java.lang.reflect.Method;

/**
 * Vadim Voronov
 * Created: 25-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BeanDumper extends JFrame {
    private JTextField query = new JTextField(20);
    private JTextArea results = new JTextArea();

    class Dumper implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = query.getText();
            Class<?> className = null;
            try {
                className = Class.forName(name);

            } catch (Exception ex) {
                results.setText("Couldn't find " + className);
                return;
            }
            dump(className);
        }
    }

    public BeanDumper() throws HeadlessException {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        jPanel.add(new JLabel("Qualified bean name:"));
        jPanel.add(query);                  // поле запроса
        add(jPanel, BorderLayout.NORTH);
        add(new JScrollPane(results)); // TextArea in center BorderLayout in JScrollPane
        Dumper dumper = new Dumper();       // ActionListener
        query.addActionListener(dumper);    // сработает в TextField по Enter
        query.setText("ch22.ex35.codea.Frog");
        dumper.actionPerformed(new ActionEvent(dumper, 0, ""));  // обработчик
    }

    public void print(String s) {
        results.append(s + "\n");
    }

    public void dump(Class<?> bean) {

        results.setText(""); // clear TextArea
        BeanInfo beanInfo = null;
        String regex = "(\\w+\\.)*";

        try {
            beanInfo = Introspector.getBeanInfo(bean, Object.class);
        } catch (IntrospectionException e) {
            print("Couldn't introspect " + bean.getName()); // bean Class<>
            return;
        }
        for (PropertyDescriptor propDescr : beanInfo.getPropertyDescriptors()) { // поля
            Class<?> propClass = propDescr.getPropertyType();  // class поля
            if (propClass == null) {
                continue;
            }
            print("Property type:");
            print("  " + propClass.getName().replaceAll(regex, ""));  //class поля


            print("Property name: ");
            print("  " + propDescr.getName());  // имя поля
            Method readMethod = propDescr.getReadMethod();
            if (readMethod != null) {
                print("Read method:");
                print("  " + readMethod.getName().replaceAll(regex, "") + "()");   // getter поля
            }
            Method writeMethod = propDescr.getWriteMethod();
            if (writeMethod != null) {
                print("Write method: ");
                print("  " + writeMethod.getName().replaceAll(regex, "") + "()");   // setter поля
            }
            print("===================");
        }
        print("Public methods:");
        for (MethodDescriptor methodDescr : beanInfo.getMethodDescriptors()) {
            print(methodDescr.getMethod().toString().replaceAll(regex, ""));
        }
        print("===================");
        print("Event support:");
        for (EventSetDescriptor eventDescr : beanInfo.getEventSetDescriptors()) {
            print("Listener type:");
            print("  " + eventDescr.getListenerType().getName().replaceAll(regex, ""));
            for (Method method : eventDescr.getListenerMethods()) {
                print("Listener method:");
                print("  " + method.getName().replaceAll(regex, "") + "()");
            }
            for (MethodDescriptor methodDescr : eventDescr.getListenerMethodDescriptors()) {
                print("Method descriptor:");
                print("  " + methodDescr.getMethod().toString().replaceAll(regex, "") + "()");
            }
            Method addListener = eventDescr.getAddListenerMethod();
            print("Add Listener Method:");
            print("  " + addListener.toString().replaceAll(regex, "") + "()");
            Method removeListener = eventDescr.getRemoveListenerMethod();
            print("Remove Listener Method:");
            print("  " + removeListener.toString().replaceAll(regex, "") + "()");
            print("===================");
        }
    }

    public static void check() {
        SwingConsole.run(new BeanDumper(), 600, 500);
    }


}
