package ch18.ex33.codea;

import java.util.prefs.Preferences;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class PreferencesDemo {
    public static void check() {
        try {
            System.out.println("If Windows issue Warning");
            System.out.println("Goto HKLM/Software/JavaSoft >> make new Key Prefs");

            System.out.println("\nPreference Demo:");
            Preferences prefs = Preferences.userNodeForPackage(Preferences.class);   // это узел хранения пользователя
            prefs.put("Location", "Oz");
            prefs.put("FootWear", "Ruby Slippers");
            prefs.putInt("Companions", 4);
            prefs.putBoolean("Are the witches?", true);
            int usageCount = prefs.getInt("UsageCount", 0);
            usageCount++;
            prefs.putInt("UsageCount", usageCount);
            for (String key : prefs.keys()) {
                System.out.printf("%-28s:%s\n",key,prefs.get(key,null));
           }
            System.out.println("How many companions D.have? :"+prefs.getInt("Companions",0));


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
