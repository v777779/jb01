package ch18.ex02.access.office;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by V1 on 05-Apr-17.
 */
public class SortedDirListOffice {
    private List<String> list = new ArrayList();  // работает только на одном уровне
    private File path;

    public SortedDirListOffice() {
        this.path = new File(".");
    }

    public SortedDirListOffice(String path) {
        this.path = new File(path);
    }

    public String[] list() {
        String[] list = path.list(); // просто список файлов текущего каталога
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER); // сортировать
        return list; // вернуть сортированный список файлов текущего каталога
    }

    public String[] list(String regex) {
        String[] list = path.list(new FilenameFilter() {
            Pattern pattern = Pattern.compile(regex);   // скомпилировали regex
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER); // сортировать
        return list;
    }

}
