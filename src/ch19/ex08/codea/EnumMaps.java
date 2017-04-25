package ch19.ex08.codea;

import lib.enums.AlarmPoints;

import java.util.EnumMap;
import java.util.Map;

import static lib.enums.AlarmPoints.*;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class EnumMaps {
    public static void check() {
        EnumMap<AlarmPoints, Integer> sMap = new EnumMap<>(AlarmPoints.class);  // через перечисления
        EnumMap<AlarmPoints, ICommand> cMap = new EnumMap<>(AlarmPoints.class); // через перечисления

        sMap.put(KITCHEN, 12);
        sMap.put(OFFICE1, 15);
        sMap.put(STAIR2, 124);

        System.out.println("EnumMap<AlarmPoints, Integer> sMap:");
        System.out.println("----------------------------");
        System.out.println(sMap);



        System.out.println("\nEnumMap<AlarmPoints, ICommand> cMap:");
        System.out.println("----------------------------");
        cMap.put(KITCHEN, new ICommand() {
            @Override
            public void action() {
                System.out.println("Kitchen Light On");
            }
        });
        cMap.put(BATHROOM, new ICommand() {
            @Override
            public void action() {
                System.out.println("Bathroom Water On");
            }
        });
        cMap.put(UTILITY, new ICommand() {
            @Override
            public void action() {
                System.out.println("Tools Locked Off");
            }
        });

        for (Map.Entry<AlarmPoints,ICommand> entry : cMap.entrySet()) {
            System.out.print(entry.getKey()+" : ");
            entry.getValue().action();
        }

        System.out.println("\nEnumMap<> cMap Replace Methods:");
        System.out.println("----------------------------");
        cMap.put(UTILITY, new ICommand() {
            @Override
            public void action() {
                System.out.println("Tools Started Working");
            }
       });
        for (Map.Entry<AlarmPoints,ICommand> entry : cMap.entrySet()) {
            System.out.print(entry.getKey()+" : ");
            entry.getValue().action();
        }


    }
}
