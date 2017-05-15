package hw.vpex.arrays;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class StringArray {
    public static void main(String[] args) {
        String str;
        String input, text;
        input = JOptionPane.showInputDialog("str=");
        str = String.valueOf(input);
        System.out.println(str);
        text = "Исходная строка:\nstr=" + str;
        JOptionPane.showMessageDialog(null, text);

        String[] sArray = str.split("\\W+");
        Map<String, Integer> map = new HashMap();
        for (String s : sArray) {
            if (s.equals("")) {
                continue;
            }
            Integer value = map.get(s);
            if (value == null) {
                value = 0;
            }
            map.put(s,++value);
        }
        System.out.println("\nResults:");
        for (String s : map.keySet()) {
            System.out.println(s+":"+map.get(s)+" ");
        }



    }

}
