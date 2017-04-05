package ch18.ex02.access;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by V1 on 05-Apr-17.
 */
public class SortedDirList {
    private List<String> list = new ArrayList();
    private final int MAX_LEVEL = 8; // прокачиваем 8 уровней максимум
    private int level = 0; // уровень прокачки каталогов
    private String path;


    public SortedDirList(String path) {
        this.path = path;
        readPath(new File(path)); //  прокачать каталог
        Collections.sort(list);   // отсортировать результат
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

    private void readPath(File path) {  // каталоги не пускать иначе выдают Exception
        level++;
        if (level > 8) {
            level--;
            return;
        }
        if (!path.isDirectory()) {
            list.add(path.getPath() + path.getName());
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
                list.add(file.getPath());
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

}
