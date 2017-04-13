package ch18.ex26.exercise;

import lib.files.Catalog;

import java.io.File;
import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 07-Mar-17.
 */
public class JGrepFC {
    private String fName;
    private String regex;

    public JGrepFC(String fName, String regex) {
        this.fName = fName;
        this.regex = regex;
    }

    public void find() {
        if (fName.length() == 0 || regex.length() == 0) {
            System.out.println("Usage:  fileName, regex");
            return;
        }
        final int BSIZE = 64; //


        File path = new File(fName);
        File[] files = {path};
        if (path.isDirectory()) {
            files = Catalog.walk(path).getListFiles().toArray(new File[0]);
        }

        for (File file : files) {
            try {
                FileChannel fc = new FileInputStream(file).getChannel();
                MappedByteBuffer mbb;
                int index = 1; // перебор строк
                System.out.println("Search in file:"+file.getName());
                for (int i = 0; i < fc.size(); i += BSIZE) {
                    long size = BSIZE;
                    if (i + BSIZE > fc.size()) {
                        size = fc.size() - i;
                    }
                    mbb = fc.map(FileChannel.MapMode.READ_ONLY, i, size); // внутри сегмента
                    byte[] bytes = new byte[(int) size]; // новый буфер
                    mbb.get(bytes);
                    String s = new String(bytes, StandardCharsets.UTF_8);
//                System.out.println(s);
                    Pattern p = Pattern.compile(regex);
                    Matcher m = p.matcher("");      // подготовили объект для работы со строками

                    m.reset(s); // подключили строку
                    while (m.find()) {
                        System.out.printf("%2d: %-10s %2d\n", index++, m.group(), m.start());  // показывает позицию в строке
                    }
                }
                fc.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }

}
