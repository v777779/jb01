package ch11.ex20.access;


import lib.utils.TextFile;
import java.util.*;


/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 20 Map  Check\n");

        Set<String> set = new TreeSet<>();
        List<String> textList = new TextFile("src/ch11.ex16/local/Local.java", "\\W+");  // в ArrayList
        set.addAll(textList);  // скачать все слова в TreeSet через ArrayList

        HashSet<Character> charSet = new HashSet<>(); // символы в набор HashSet
        Collections.addAll(charSet,new Character[]{ 'A','E','I','O','U','a','e','i','o','u' });
//        HashSet<Character> charSet = new HashSet<>(Arrays.asList(   // one line solution
//                new Character[]{ 'A','E','I','O','U','a','e','i','o','u' }));

        System.out.println("Count letters in the file TextFile via TreeSet");
        HashMap<Character, Integer> fileMap = new HashMap<>();
        int count = 0;
        for (String s : set) {
            for (char c : s.toCharArray()) {
                if (charSet.contains(c)) {
                    if (fileMap.get(c) == null) {
                        fileMap.put(c,0);           // сократить на одну операцию
                    }
                    fileMap.put(c,fileMap.get(c)+1); // повторяем запрос уже заполнили
                     count++;
                }
            }
        }
        System.out.println("TreeSet size:"+set.size());

        System.out.println("Letter count:" + count);
        System.out.println("FileMap     :"+fileMap);
//in textFile
        System.out.println("\nOfficial solution:");
        System.out.println("Count letters in the file TextFile via ArrayList");

        fileMap.clear();
        count = 0;
        for (String s : textList) {                  // ArrayList
            for (char c : s.toCharArray()) {
                if (charSet.contains(c)) {
                    Character ch = Character.toLowerCase(c);
                    if (fileMap.get(ch) == null) {
                        fileMap.put(ch,0);              // сократить на одну операцию
                    }
                    fileMap.put(ch,fileMap.get(ch)+1);  // повторяем запрос уже заполнили
                    count++;
                }
            }
        }
        System.out.println("TextFile size:"+textList.size());
        System.out.println("Letters count:" + count);
        System.out.println("FileMap      :"+fileMap);
    }
}
