package lib.files;

import ch18.ex04.local.PPrint;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by V1 on 06-Apr-17.
 */
public class Catalog {

    public static class TreeInfo implements Iterable<File> {  // класс работы с деревом
        private List<File> listFiles = new ArrayList<>();
        private List<File> listDirs = new ArrayList<>();

        @Override
        public Iterator<File> iterator() {  // по умолчанию Iterator() listFiles<>
            return listFiles.iterator();
        }
        private void addAll(TreeInfo treeInfo) {  // поглотить коллекцию
            listFiles.addAll(treeInfo.listFiles);
            listDirs.addAll(treeInfo.listDirs);
        }
        @Override
        public String toString() {
        return   "Catalogs:"+ PPrint.pFormat(listDirs)+ "\n"+
                 "Files   :"+PPrint.pFormat(listFiles);
        }

        public List<File> getListFiles() {
            return listFiles;
        }

        public List<File> getListDirs() {
            return listDirs;
        }
    }

    public static File[] local(File path, final String regex) {// regex must be final to use it in the inner class
        return path.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex); // final helps to do this

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches(); // работает на уровне new File()
//              return pattern.matcher(name).matches(); // работает точно также ???
            }
        });
    } // codea()

    public static File[] local(String path, final String regex) {// перегрузка
        return local(new File(path), regex);
    }


    private static TreeInfo recursive(File path, String regex) {
        TreeInfo treeInfo = new TreeInfo(); // конструктор по умолчанию
        for (File file : path.listFiles()) {  // прогнать базовый каталог
            if (file.isDirectory()) {
                treeInfo.listDirs.add(file); // добавить каталог в папку каталогов
                TreeInfo subTree = recursive(file, regex); // добавить каталоги и папки подходящие под regex
                treeInfo.addAll(subTree); // поглотить (каталоги дважды?)
            } else {
                if (file.getName().matches(regex)) {
                    treeInfo.listFiles.add(file);
                }
            }
        }
        return treeInfo;
    }

    public static TreeInfo walk(File path, String regex) {
        return recursive(path, regex);
    }

    public static TreeInfo walk(String path, String regex) {
        return recursive(new File(path), regex);
    }

    public static TreeInfo walk(File path) {  // перегружен все файлы и папки
        return recursive(path, ".*");
    }

    public static TreeInfo walk(String path) {  // перегружен все файлы и папки
        return recursive(new File(path), ".*");
    }





}
