package ch17.ex15.remote;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by V1 on 30-Mar-17.
 */
public class SpringDetector {
    public static <T extends GroundHog2> void detect(Class<T> type) {
        try {
            Constructor<T> gHog = type.getConstructor(int.class);
            Map<GroundHog2, Prediction> map = new HashMap<>();
            for (int i = 0; i < 10; i++) {
                map.put(gHog.newInstance(i), new Prediction());
            }
            System.out.println(map);
            GroundHog2 gh = new GroundHog2(3);
            System.out.print("looking for :" + gh+"=");
            if (map.containsKey(gh)) {
                System.out.println(map.get(gh));
            } else {
                System.out.println("key not found");
            }

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }


    public static void detect() {
        Map<GroundHog2, Prediction> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(new GroundHog2(i), new Prediction());
        }
        System.out.println("map:" + map);
        GroundHog2 gh = new GroundHog2(3);  // новый объект с новым адресом
        System.out.print("looking for :" + gh+"=");
        if (map.containsKey(gh)) {  // при базовом Object.hashCode() Не распознает
            System.out.println(map.get(gh)); // т.к. у него свой адрес
        } else {
            System.out.println("key not found");
        }

    }
}
