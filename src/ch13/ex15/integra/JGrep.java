package ch13.ex15.integra;

import lib.utils.TextFile;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 07-Mar-17.
 */
public class JGrep {
    private String fName;
    private String regex;

    public JGrep(String fName, String regex) {
        this.fName = fName;
        this.regex = regex;
    }

    public void find() {
        ArrayList<String> alist;
        if (fName.length() == 0 || regex.length() == 0) {
            System.out.println("Usage:  fileName, regex");
            return;
        }
        try {
            alist = new TextFile(fName);
        } catch (Exception e) {
            System.out.println("File Not Found: "+fName);
            return;
        }

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("");      // подготовили объект для работы со строками
        int index = 1; // перебор строк


        for (String s : alist) {
//            System.out.println(s);
            m.reset(s); // подключили строку
            while (m.find()) {
                System.out.printf("%2d: %-10s %2d\n",index++,m.group(),m.start());  // показывает позицию в строке
            }
        }


    }

}
