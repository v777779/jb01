package lib.orange;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by V1 on 06-Apr-17.
 */
public class GCFileRead {
    private static Map<String, IFactoryGC<GreenHouse, Event>> hMap = new HashMap<>();  // инициализация карты

    static {
        hMap.put("LightOn".toLowerCase(), new GCFactory.LightOn());
        hMap.put("LightOff".toLowerCase(), new GCFactory.LightOff());
        hMap.put("WaterOn".toLowerCase(), new GCFactory.WaterOn());
        hMap.put("WaterOff".toLowerCase(), new GCFactory.WaterOff());
        hMap.put("ThermoDay".toLowerCase(), new GCFactory.ThermoDay());
        hMap.put("ThermoNight".toLowerCase(), new GCFactory.ThermoNight());
        hMap.put("Bell".toLowerCase(), new GCFactory.Bell());
        hMap.put("Restart".toLowerCase(), new GCFactory.Restart());
        hMap.put("AirOn".toLowerCase(), new GCFactory.AirOn());
        hMap.put("AirOff".toLowerCase(), new GCFactory.AirOff());
        hMap.put("AirOff".toLowerCase(), new GCFactory.AirOff());
        hMap.put("Terminate".toLowerCase(), new GCFactory.TerminateGC());
        hMap.put("HumidityOn".toLowerCase(), new GCFactory.HumidityOn());
        hMap.put("HumidityOff".toLowerCase(), new GCFactory.HumidityOff());
    }

    public GCFileRead() {
    }

    public static void events(GreenHouse gc, String fileName) {
        List<Event> list = new ArrayList<>();
        List<String[]> glist = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName)); // инициализируем декоратор файлом
            String s;
            while ((s = in.readLine()) != null) {   // читаем строку из файла в s
                String[] ss = s.replaceAll("[/ ]", "").split("\\W+");

                if (ss == null || ss.length < 4 || (!ss[0].equals("event") && !ss[0].equals("system"))) {
                    continue;
                }

                IFactoryGC<GreenHouse, Event> factEvent = hMap.get(ss[1].toLowerCase());
                if (factEvent == null) {
                    continue;
                }
                if (ss[0].equals("system")) {
                    glist.add(ss);  // отрабатываем только созранение массива, чтобы набрать полный list
                } else {
                    list.add(factEvent.create(gc, Long.valueOf(ss[2]))); // event нет повторов илии списка
                }
            }
            in.close();// закрываем поток
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
// системные вызовы
        for (String[] ss : glist) {
            gc.addEvent(hMap.get(ss[1].toLowerCase()).create(gc, Long.valueOf(ss[2]), Integer.valueOf(ss[3]), list));
        }
    }

}

