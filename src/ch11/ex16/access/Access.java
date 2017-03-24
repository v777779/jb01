package ch11.ex16.access;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void showSet(Set<Word> set) {
        Iterator<Word> it = set.iterator();
        int k = 1;
        while (it.hasNext()) {
            System.out.printf(it.next().toString("%-14s:%2d   "));
            if ( ((k++ % 8) == 0)) {
                System.out.println(); // каждое 25 слово переводим строку
            }
        }
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 16 Set Contains Check\n");

        ArrayList<String> textFile = new TextFile("src/ch11.ex16/local/Local.java", "\\W+");  //
        Set<String> tset = new TreeSet<>(textFile); // сортированное множество

        Set<Character> charSet = new TreeSet<>();
        Collections.addAll(charSet,new Character[]{ 'A','E','I','O','U','a','e','i','o','u' });

//        char[] chs = new String("AEIOUaeiou").toCharArray();
//        Collections.addAll(charSet, ArrayUtils.toObject(chs));           // множество гласных
        Set<Word> lhset = new LinkedHashSet<>(); // мой класс не Comparable поэтому только HashSet или LinkedHashSet

        int count = 0;
        for (String s : tset) {
            Word word = new Word(s,0); // создаем объект для обработки
            for (char c : s.toCharArray()) {
                if (charSet.contains(c)) {
                    word.inc();             // отрабатываем анализ слова
                    count++;
                }
            }
            lhset.add(word);                // добавить так как на входе сортированные и не повторяемые слова
        }                                   // иначе добавить компаратор и использовать TreeSet
                                            // или анализировать самому HashSet на каждом слове
        System.out.println("Letter       count: " + count);
        System.out.println("TreeSet       size: " + tset.size());
        System.out.println("LinkedHashSet size: " + lhset.size());

        showSet(lhset);
        System.out.println();

        Set<Word> hset = new HashSet<>(); // пустой массив для HashSet

        System.out.println("Проверяем повторное добавление класса хранения пользователя");
        System.out.println("Word count:"+textFile.size());
        for (String s : textFile) {
            Word word = new Word(s,0);
            for (char c : s.toCharArray()) {
                if (charSet.contains(c)) {
                    word.inc();
                    count++;                 // общее число гласных на файл
                }
            }
            hset.add(word); // без проверки
            Word w1 = new Word(word.s,word.count);
            Word w2 = new Word(word.s,word.count);
            hset.add(w1); // без проверки
            hset.add(w2); // без проверки  и все равно добавляет
        }
        System.out.println("\nHashSet.size():"+hset.size());
        System.out.println("ВНИМАНИЕ. Без компаратора добавляет новые ссылки как уникальные объекты");
        showSet(hset);

        Set<Word> tcset = new TreeSet<>();
        System.out.println("\n\nПроверка числа слов в файле на базе Word и TreeSet:"+tcset.size());

        for (String s : textFile) {
            Word word = new Word(s,0);
            if (tcset.contains(word)) {  // проверка на содержание данного слова в множестве
                word.inc();
            }
                tcset.add(word);         // такого нет, добавляем
        }
    }
}
