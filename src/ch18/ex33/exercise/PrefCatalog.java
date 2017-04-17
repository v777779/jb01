package ch18.ex33.exercise;

import java.io.File;
import java.util.prefs.Preferences;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class PrefCatalog {
    public static void check(String pathName) {
        try {
            System.out.println("If Windows issue Warning");
            System.out.println("Goto HKLM/Software/JavaSoft >> make new Key Prefs");

            System.out.println("\nPreference Demo:");
            Preferences prefs = Preferences.userRoot().node(new File(pathName).getAbsolutePath()); // это узел хранения пользователя

            int pathCount = prefs.getInt("pathCount", 0);
            pathCount++;
            prefs.putInt("pathCount", pathCount);
            for (String key : prefs.keys()) {
                System.out.printf("%-28s:%s\n",key,prefs.get(key,null));
           }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
