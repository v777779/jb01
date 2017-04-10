package ch18.ex17.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by V1 on 10-Apr-17.
 */
public class CharMap {
    public static Map<Character, Integer> count(String text) {
        Map<Character, Integer> hMap = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new StringReader(text));
            try {
                Character ch;
                while ((ch = (char) br.read()) != '\uFFFF') {
                    Integer value = hMap.get(ch);
                    if (value == null) {
                        value = 0;
                    }
                    hMap.put(ch, ++value);
                }

            } finally {
                br.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return hMap;
    }
}
