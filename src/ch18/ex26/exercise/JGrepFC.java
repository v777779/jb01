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
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 07-Mar-17.
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
            String s;
            try {
                FileChannel fc = new FileInputStream(file).getChannel();
                MappedByteBuffer mbb;
                mbb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size()); // сразу весь файл
                byte[] bytes = new byte[(int) fc.size()]; // новый буфер размером с файл
                mbb.get(bytes);
                s = new String(bytes, StandardCharsets.UTF_8);
                fc.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
// собственно поиск, отсекли все буферы
            System.out.println("Search in file:" + file.getName());
            int index = 1; // перебор строк
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher("");      // подготовили объект для работы со строками
            m.reset(s); // подключили строку
            while (m.find()) {
                System.out.printf("%2d: %-10s %2d\n", index++, m.group(), m.start());  // показывает позицию в строке
            }

        }

    }

}
