package ch11.ex22.access;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 22 Map  Check\n");

        ArrayList<String> textList = new TextFile("src/ch11.ex16/local/Local.java", "\\W+"); //ArrayList
        HashSet<Word> hset = new HashSet<>(); // работа с быстрым списком
        Iterator<Word> it;

        for (String s : textList) {     // класс TextFile >> ArrayList содержит итератор, перебираем
            Word word = new Word(s);
            if (hset.contains(word)) {  // ищем по строке  переписано Equal
                it = hset.iterator();   // итератор выделяется каждый раз на слово
                while (it.hasNext()) {
                    Word itWord = it.next();  // ВНИМАНИЕ. получили доступ к объекту
                    if (itWord.equals(word)) {
                        itWord.inc();   // обновить объект
                    }
                }
            }else{
                hset.add(word); // добавили созданный объект
            }
        }

        System.out.println("\nHashSet UnSorted:");
        Word.show(hset.iterator());

        TreeSet<Word> tset = new TreeSet<>(hset); // сортировка по компаратору в Word
        System.out.println("\n\nTreeSet Sort with Word.compare():");
        Word.show(tset.iterator());


    }
}
