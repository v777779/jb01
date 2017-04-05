package ch18.ex03.access;

import java.io.File;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by V1 on 05-Apr-17.
 */
public class SortedDirList {
    private List<String> list = new ArrayList();
    private Map<String,Long> map = new HashMap<>();
    private final int MAX_LEVEL = 8; // прокачиваем 8 уровней максимум
    private int level = 0; // уровень прокачки каталогов
    private String path;


    public SortedDirList(String path) {
        this.path = path;
        readPath(new File(path)); //  прокачать каталог
        Collections.sort(list);   // отсортировать результат
    }

    private void addFile(File file) {
        list.add(file.getPath());
        map.put(file.getPath(),file.length());
    }

    public List<String> filter(List<String> list, String regex) {  // реализация интерфейса
        Pattern pattern = Pattern.compile(regex);   // скомпилировали regex
        List<String> filteredList = new ArrayList<>();
        for (String s : list) {
            if (pattern.matcher(s).matches()) {
                filteredList.add(s);
            }
        }
        return filteredList;
    }

    public Map<String,Long> filter(Map<String,Long> map, String regex) {  // реализация интерфейса
        Pattern pattern = Pattern.compile(regex);   // скомпилировали regex
        Map<String,Long> filteredMap = new HashMap<>();
        for (String s : map.keySet()) {
            if (pattern.matcher(s).matches() || regex ==  "") { // regex=="" пропускает все
                filteredMap.put(s,map.get(s));
            }
        }
        return filteredMap;
    }

    private void readPath(File path) {  // каталоги не пускать иначе выдают Exception
        level++;
        if (level > 8) {
            level--;
            return;
        }
        if (!path.isDirectory()) {
            addFile(path);
            level--;
            return;
        }
        File[] fList = path.listFiles();
        if (fList == null || fList.length == 0) {
            level--;
            return;
        }
        for (File file : fList) {
            if (file.isDirectory()) {
                readPath(file);
            } else {
                addFile(file);
            }
        }
        level--; // выходим когда отработали все
    }

    public List<String> list() {
        return list;
    }

    public List<String> list(String regex) {
        return filter(list, regex); // искать каталоги по patternlist;
    }
    public Map<String,Long> map(String regex) {
        return filter(map, regex); // искать каталоги по patternlist;
    }

}
