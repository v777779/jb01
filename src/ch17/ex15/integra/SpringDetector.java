package ch17.ex15.integra;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by V1 on 30-Mar-17.
 */
public class SpringDetector {
    public static <T extends GroundHog> void detect(Class<T> type) {
        try {
            Constructor<T> gHog = type.getConstructor(int.class);
            Map<GroundHog, Prediction> map = new HashMap<>();
            for (int i = 0; i < 10; i++) {
                map.put(gHog.newInstance(i), new Prediction());
            }
            System.out.println(map);
            GroundHog gh = new GroundHog(3);
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
        Map<GroundHog, Prediction> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(new GroundHog(i), new Prediction());
        }
        System.out.println("map:" + map);
        GroundHog gh = new GroundHog(3);  // новый объект с новым адресом
        System.out.print("looking for :" + gh+"=");
        if (map.containsKey(gh)) {  // при базовом Object.hashCode() Не распознает
            System.out.println(map.get(gh)); // т.к. у него свой адрес
        } else {
            System.out.println("key not found");
        }
    }
}
