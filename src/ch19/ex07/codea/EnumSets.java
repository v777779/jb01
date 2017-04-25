package ch19.ex07.codea;

import java.util.EnumSet;
import static ch19.ex07.codea.AlarmPoints.*;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class EnumSets {
    public static void check() {
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class); // пустой набор заданного класса
        points.add(BATHROOM); // used static import
        System.out.println("add                    :"+points);
        points.addAll(EnumSet.of(STAIR1,STAIR2,KITCHEN)); // набор через addAll
        System.out.println("addAll EnumSet.of      :"+points);
        points.addAll(EnumSet.allOf(AlarmPoints.class));  // можно добавить но смысла нет
        System.out.println("addAll EnumSet.allOf   :"+points);

        points = EnumSet.allOf(AlarmPoints.class); // добавить весь класс
        System.out.println("=      EnumSet.allOf   :"+points);

        points.removeAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
        System.out.println("removeAll EnumSet.of   :"+points);

        points.removeAll(EnumSet.range(OFFICE1,OFFICE4));
        System.out.println("removeAll EnumSet.range:"+points);

        points = EnumSet.complementOf(points); // набор через addAll
        System.out.println("EnumSet.complementOf   :"+points);  // отрабатывает полный набор и получает недостающие

    }
}
