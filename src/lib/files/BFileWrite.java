package lib.files;

import java.io.*;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/**
 * Created by V1 on 06-Apr-17.
 */
public class BFileWrite {
    public static void writeString(String fileName, String string) {
        try {
            PrintWriter pw = new PrintWriter(fileName);
            pw.print(string);
            pw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeList(List<String> list, String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw); // буферизованный вывод
            PrintWriter pw = new PrintWriter(bw);  // параметр буферизованный вывод
            ListIterator<String> lit = list.listIterator(list.size());
            int lineCount = list.size();
            while (lit.hasPrevious()) {
                pw.printf(Locale.ENGLISH,"%2d:%s\n",lineCount--,lit.previous());
            }
            pw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

