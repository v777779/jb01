package ch18.ex26.exercise.office;

import lib.files.Catalog;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 07-Mar-17.
 */
public class JGrepFCOffice {
    private String fName;
    private String regex;

    public JGrepFCOffice(String fName, String regex) {
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
                System.out.println("Search in file:" + file.getName());

                ByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size()); // весь файл
                String stdCharset = System.getProperty("file.encoding");
                CharBuffer cb = Charset.forName(stdCharset).decode(bb);
                String[] strings = cb.toString().split("\r\n");  // весь файл в виде массива строк

                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher("");      // подготовили объект для работы со строками
                int index = 1;                        // перебор строк
                for (String s : strings) {
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
