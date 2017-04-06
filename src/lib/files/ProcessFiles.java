package lib.files;

import java.io.File;
import java.io.IOException;

/**
 * Created by V1 on 06-Apr-17.
 */
public class ProcessFiles {
    private IStrategy strategy; // обработчик файлов  IStrategy2.process(File)
    private String ext;

    public ProcessFiles(IStrategy strategy, String ext) {
        this.strategy = strategy;
        this.ext = ext;
    }

    public void processTree(File root)  throws IOException{
        for (File file : Catalog.walk(root.getAbsolutePath(),".*\\."+ext)) { // все файлы Tree данного расширения
            strategy.process(file.getCanonicalFile()); // убирает  "." маркер текущего каталога из пути
        }
    }

    public void start(String[] args) {
        try {
            for (String fileName : args) {
                File file = new File(fileName);
                if (file.isDirectory()) {
                    processTree(file);   // issue IOException
                } else {
                    if (!fileName.endsWith("." + ext)) {
                        fileName += "."+ext;
                        strategy.process(new File(fileName).getCanonicalFile());
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e); // выдать ошибку ввода вывода
        }
    }

}
