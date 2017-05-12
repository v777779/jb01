package hw.vpex;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * Vadim Voronov
 * Created: 12-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MainKey {
    public static KeyCode keys;
    public static KeyEvent event;
    public static void main(String[] args) {
        Map<KeyCode, Boolean> map = new HashMap<>();
        map.put(KeyCode.ESCAPE,true);
        map.put(KeyCode.SPACE,true);
        map.put(KeyCode.TAB,true);
        map.put(KeyCode.A,true);
        map.put(KeyCode.E,true);
        map.put(KeyCode.W,false);
        map.put(KeyCode.S,true);
        map.put(KeyCode.D,false);
// собственно работа с кнопками

//        keys = event.getCode();
        keys = KeyCode.TAB;
        if (map.get(keys)) {
            System.out.println("Pressed key");
        } else {
            System.out.println("New key");
        }

    }
}
