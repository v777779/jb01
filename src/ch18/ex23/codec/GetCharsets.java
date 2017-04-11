package ch18.ex23.codec;

import java.nio.charset.Charset;
import java.util.*;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 11-Apr-17.
 */
public class GetCharsets {
    public static List<String> getCharset() {
        SortedMap<String, Charset> sMap = Charset.availableCharsets();
        System.out.println("\nAvailable Charsets:");

        List<String> list = new ArrayList();

        StringBuilder sb = new StringBuilder();
        for (String s : sMap.keySet()) {
            sb.append(s);
            Iterator aliases = sMap.get(s).aliases().iterator(); // получить Charset и его aliases
            if (aliases.hasNext()) {
                sb.append(": ");
                while (aliases.hasNext()) {
                    sb.append(aliases.next());  // alias
                    if (aliases.hasNext()) {
                        sb.append(", "); //если еще будет, то печатаем продолжение
                    }
                }
                sb.append('\n'); // перевод строки
            }
        }
        list.addAll(Arrays.asList(sb.toString().split("\n")));
        return list;
    }
}
