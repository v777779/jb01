package ch17.ex12.include;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nMap Check\n");
        SimpleMap<String, String> map = new SimpleMap<>(6); // длину создаем сразу
        map.put("sky", "blue");
        map.put("grass", "green");
        map.put("ocean", "dancing");
        map.put("tree", "tall");
        map.put("earth", "brown");
        map.put("sun", "warm");
        try {
            map.put("extra", "object");
        } catch (Exception e) {
            System.out.println("catch: map bound exception");
        }
        System.out.println(map);
        System.out.println(map.get("ocean"));
    }
}
